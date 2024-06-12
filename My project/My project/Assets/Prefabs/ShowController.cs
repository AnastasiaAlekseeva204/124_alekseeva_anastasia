using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class ShowController : MonoBehaviour
{
    [SerializeField]
    private GameObject prefabBullet;
    private bool flipFlag;
    private bool canShoot = true;
    private AudioSource shootSound;
    private bool isPlay = true;

    public bool IsPlay { get => isPlay; set => isPlay = value; }

    // Start is called before the first frame update
    void Start()
    {
        shootSound = GetComponents<AudioSource>()[1];
    }

    void Update()
    {
        if(isPlay){
            flipFlag = GameObject.Find("Player").GetComponent<MoveController>().FlipFlag;
            if(Input.GetKeyDown(KeyCode.F) && canShoot){
                if(prefabBullet != null){
                    StartCoroutine(DelayBetweenShoot());
                    shootSound.Play();
                    Debug.Log(transform.position.x);
                    Instantiate(prefabBullet, new Vector3(transform.position.x,transform.position.y,transform.position.z),Quaternion.identity);
                }
            }
        }
    }
    IEnumerator DelayBetweenShoot(){
        canShoot = false;
        yield return new WaitForSeconds(0f);
        canShoot = true;
    }
}
