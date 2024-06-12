using System.Collections;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using Unity.VisualScripting;
using UnityEngine;

public class BulletController : MonoBehaviour
{
    [SerializeField]
    [Range (0,2f)]
    private float bullerSpeed;
    private bool bulleRight;
    private Camera playerCamera;
    private bool isPlay = true;

    public bool IsPlay { get => isPlay; set => isPlay = value; }

    void Start()
    {
        playerCamera = Camera.main;
        bulleRight = GameObject.Find("Player").GetComponent<MoveController>().FlipFlag;
        
    }
    void Update()
    {
        if(isPlay)
        {
            transform.Translate(new Vector3((bulleRight ? -bullerSpeed : bullerSpeed)*Time.deltaTime, 0, 0));
            if(playerCamera != null)
            {
                if (playerCamera.WorldToViewportPoint(transform.position).x < 0 || playerCamera.WorldToViewportPoint(transform.position).x > 1)
                    Destroy(gameObject);
            }
        }
    }
    private void OnTriggerEnter2D(Collider2D collision){
        if(collision.gameObject.tag =="Enemy"){
            Destroy(collision.gameObject);
            Destroy(gameObject);
        }
    }
}
