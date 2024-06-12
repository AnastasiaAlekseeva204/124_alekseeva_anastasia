using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class PlayerAnimationController : MonoBehaviour
{
    // Start is called before 
    private Animator animator;
    private MoveController moveController;
    private bool playAnimJump;
    private Rigidbody2D rb;
    private bool isPlay = true;

    public bool IsPlay { get => isPlay; set => isPlay = value; }

    void Start()
    {
        rb = GetComponent<Rigidbody2D>();
        animator = GetComponent<Animator>();
        moveController = GetComponent<MoveController>();
    }
    void Update()
    {
        if(isPlay){
            animator.speed = 1;
            
            animator.SetFloat("yVelocity",rb.velocity.y);
            if(!moveController.CanJump){
                animator.SetTrigger("JumpTrigger");
            }
            if((Input.GetKey(KeyCode.A)|| Input.GetKey(KeyCode.D))&& moveController.CanJump){
                animator.SetTrigger("RunTrigger");
            }
            else if((Mathf.Abs(rb.velocity.y)< 0.1f) && moveController.CanJump)
            {
                animator.SetTrigger("IdelTrigger");
            }
        }
        else{
            animator.speed = 0;
        }
    }
}
