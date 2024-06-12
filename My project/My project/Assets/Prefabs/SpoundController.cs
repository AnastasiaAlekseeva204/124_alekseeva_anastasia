using System;
using System.Collections;
using System.Collections.Generic;
using Unity.VisualScripting;
using UnityEngine;

public class SpoundController : MonoBehaviour
{
    private int numberCheck;
    private Vector3 spawnPos;

    public Vector3 SpawnPos { get => spawnPos; set => spawnPos = value; }
    void Start()
    {
        numberCheck = 1;
        
    }
    void Update()
    {
    }
    private void OnTriggerEnter2D(Collider2D collision){
         if(collision.gameObject.tag == "Check"){
            if(numberCheck != Convert.ToInt16(collision.gameObject.name.Substring(gameObject.name.Length-1))){
                SpawnPos = collision.transform.position;
                numberCheck = Convert.ToInt16(collision.gameObject.name.Substring(gameObject.name.Length-1));
            }
         }
    }
    
}

