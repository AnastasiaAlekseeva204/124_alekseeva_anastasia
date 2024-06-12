using System.Collections;
using System.Collections.Generic;
using System.Runtime.InteropServices;
using UnityEngine;

public class PatrolController : MonoBehaviour
{
    private bool flipFlag = false;
    private bool stay = false;
    [SerializeField]
    private float speed;
    private Animator animator;
    private SpriteRenderer render;
    private bool isPlay = true;

    public bool IsPlay { get => isPlay; 
        set{
            isPlay = value; 
        }
    } 
    void Start()
    {
        animator = GetComponent<Animator>();
        render = GetComponent<SpriteRenderer>();
    }
    void Update(){
        if(isPlay){
            animator.speed = 1;
            
            if(!stay){  
                transform.Translate(new Vector3(flipFlag ? -speed : speed,0,0)* Time.deltaTime);
            }
        }
        else{
            animator.speed  = 0;
        }
    }
    void Update1()
    {
        if(isPlay){
            if(!animator.enabled){
                animator.enabled = true;
                animator.StartPlayback();
            }
            if(!stay){  
                transform.Translate(new Vector3(flipFlag ? -speed : speed,0,0)* Time.deltaTime);
            }
        }
        else{
            if(animator.enabled){
                animator.StopPlayback();
                animator.enabled = false;
            }
        }
    }
    private void Flip(){
        render.flipX = !flipFlag;
        flipFlag = !flipFlag;
    }
    private void OnTriggerEnter2D(Collider2D collision){
        if(!stay){
            StartCoroutine(StayDelay());
        }
    }
    IEnumerator StayDelay(){
        stay = true;
        animator.SetTrigger("isIdel");
        yield return new WaitForSeconds(2);
        animator.SetTrigger("isRun");
        stay = false;
        Flip();
    }
}
