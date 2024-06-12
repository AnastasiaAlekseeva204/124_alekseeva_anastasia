using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class HeartController : MonoBehaviour
{
    private GameObject[] hearts;
    [SerializeField] private int health;
    [SerializeField] private int howmanyFruitsAddHealth;
    [SerializeField] private GameObject prefabHeart;
    private Animator animator;
    private int currentHealth = 0;
    private bool flagAdd = true;
    void Start()
    {
        hearts= new GameObject[health];
        currentHealth = health;
        resetHealth(currentHealth);

        animator = GetComponent<Animator>();
        
    }
    void Update()
    {
        checkAddHealth();
        addHealth();
    }
    public void OnCollisionEnter2D(Collision2D collision){
       
        if(collision.gameObject.tag == "Trap" || collision.gameObject.tag == "Enemy"){
            Debug.Log(currentHealth);
            Debug.Log(health);
            if(currentHealth > 0 ){
                currentHealth -=1;
                GetComponents<AudioSource>()[3].Play();
                Destroy(hearts[currentHealth]);
            }
            if(currentHealth <= 0){
                GetComponents<AudioSource>()[4].Play();
                currentHealth = health-1;
                StartCoroutine(Dielay());  

            }
            
        }
    }
    IEnumerator Dielay() 
    {
        animator.SetTrigger("isDie");
        yield return new WaitForSeconds(0.5f);
        animator.SetTrigger("IdelTrigger");
        gameObject.transform.position = GetComponent<SpoundController>().SpawnPos;
        resetHealth(currentHealth);
        health = health-1;
        if(health == 1){
            health = 3;
        }
    }
    private void resetHealth(int health){
        float sizeHeartWithOffset = 0.03f*health;
        if(health == 3){
             sizeHeartWithOffset = 0.03f*health;
        }
        else if(health ==2){
            sizeHeartWithOffset = 0.06f*health;
        }
        float size = 3 + sizeHeartWithOffset;
        for(int i = 0; i < health; i++){
            hearts[i] = Instantiate(prefabHeart, Vector3.zero, Quaternion.identity);
            hearts[i].transform.SetParent(transform,false);
            hearts[i].transform.position =  new Vector3((transform.position.x - size/2+ 1.45f) + i * sizeHeartWithOffset, transform.position.y +0.3f, transform.position.z);
            
        } 
    }
    private void addHealth(){
        if(currentHealth < health){
            int tmp = gameObject.GetComponent<PickUpController>().Score;
            if(tmp %howmanyFruitsAddHealth == 0 && tmp != 0){
                float sizeHeartWithOffset = 0.14f;
                float size = health + sizeHeartWithOffset;
                hearts[currentHealth] = Instantiate(prefabHeart, Vector3.zero, Quaternion.identity);
                hearts[currentHealth].transform.SetParent(transform,false);
                hearts[currentHealth].transform.position =  new Vector3((transform.position.x - size/2+1.45f) + currentHealth * sizeHeartWithOffset, transform.position.y +0.3f, transform.position.z);
            
                currentHealth++;
                flagAdd = false;
            }
        }
    }
    private void checkAddHealth(){
        if(gameObject.GetComponent<PickUpController>().Score %10 != 0 && !flagAdd){
            flagAdd = true; 
        }
    }
}
