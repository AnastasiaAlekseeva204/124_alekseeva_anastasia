using System.Collections;
using UnityEngine;

public class MoveController : MonoBehaviour
{
    
    public float speed;
    public float powerJump;
    private bool flipFlag = true;
    private bool canJump = true;
    private bool isPlay= true;
    
    private Rigidbody2D rb;
    private SpriteRenderer render;
    private AudioSource jumpSound;
    private AudioSource walkSound;


    public bool CanJump{ get => canJump; set => canJump = value;}
    public bool FlipFlag{ get => flipFlag;}
    public bool IsPlay { get => isPlay; set => isPlay = value; }

    void Start()
    {
       rb = GetComponent<Rigidbody2D>();
       render = rb.GetComponent<SpriteRenderer>();
       jumpSound = GetComponents<AudioSource>()[0];
       walkSound = GetComponents<AudioSource>()[2];
    }
    void Update()
    {
        if(isPlay){
            transform.Translate(new Vector2(Input.GetAxis("Horizontal") * Time.deltaTime * speed,0));
            if(Input.GetAxis("Horizontal") !=0 && canJump){
                if(!walkSound.isPlaying)
                    StartCoroutine(LoopPlayWalk());
            }
            else{
                walkSound.loop = false;
            }
            if(canJump && Input.GetAxis("Jump")>0){
                canJump = false;
                rb.AddForce(powerJump*Vector2.up,ForceMode2D.Impulse);
                jumpSound.Play();
            }
            if((!flipFlag && Input.GetAxis("Horizontal")<0) || (flipFlag && Input.GetAxis("Horizontal")>0)){
                Flip();
            }
        }
    }
    private void Flip(){
        render.flipX = !flipFlag;
        flipFlag = !flipFlag;
    }
    private void OnCollisionEnter2D(Collision2D collision){
        canJump = true;
    }
    IEnumerator LoopPlayWalk(){
        walkSound.Play();
        yield return new WaitForSeconds(walkSound.clip.length + 0.18f); 
    }
}
