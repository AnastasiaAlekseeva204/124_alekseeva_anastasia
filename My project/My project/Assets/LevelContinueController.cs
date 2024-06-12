using System.Collections;
using System.Collections.Generic;
using Unity.VisualScripting;
using UnityEngine;
using UnityEngine.SceneManagement;
public class LevelContinueController : MonoBehaviour
{
    // Start is called before the first frame update
    private void OnTriggerEnter2D(Collider2D collision){
        if(collision.gameObject.name == "Player"){
            SceneManager.LoadScene("Continue",LoadSceneMode.Single);
        }
    }
}