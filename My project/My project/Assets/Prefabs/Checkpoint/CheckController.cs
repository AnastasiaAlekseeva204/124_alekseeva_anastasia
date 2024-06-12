using System.Collections;
using System.Collections.Generic;
using Unity.VisualScripting;
using UnityEngine;

public class CheckController : MonoBehaviour
{
    private bool isTake;
    public bool IsTake{get => isTake; set{if(!value) isTake = value;}}
    private AudioSource audioCheck;
    private Animator animatorFlag;
    private bool isPlay = true;
    private Animator AnimatorFlag{ get => animatorFlag;}
    public bool IsPlay { get => isPlay; set => isPlay = value; }
    void Start()
    {
        isTake = false;
        animatorFlag = GetComponent<Animator>();
        audioCheck = GetComponent<AudioSource>();
    }

    void Update()
    {
        if(isPlay){
            animatorFlag.speed = 1;
        }
        else{
            animatorFlag.speed = 0;
        }
        
    }
    private void OnTriggerEnter2D(Collider2D collision){
        if(collision.gameObject.name == "Player"){
            CheckController[] massChecks = GameObject.Find("CHECK_POINT").GetComponentsInChildren<CheckController>();
            foreach(CheckController script in massChecks){
                script.isTake = false;
                script.animatorFlag.SetBool("IsActive",false);
            }
            if(!this.isTake){
                audioCheck.Play();
                isTake = true;
            } 
            animatorFlag.SetBool("IsActive",true);
        }
    }
}
