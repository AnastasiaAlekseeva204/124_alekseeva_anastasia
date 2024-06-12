using System;
using System.Collections;
using System.Collections.Generic;
using System.Timers;
using UnityEngine;
using UnityEngine.Audio;
using UnityEngine.UI;

public class MenuController : MonoBehaviour
{
    [SerializeField]
    private AudioMixer musicMixer;
    [SerializeField]
    private AudioMixer soundMixer;
    private AudioSource m_AudioSourse;
    [SerializeField]
    private GameObject menuPanel;
    private bool isPlaying;
    
    // Start is called before the first frame update
    void Start()
    {
        m_AudioSourse = GetComponent<AudioSource>();
        isPlaying  = true;
        //menuPanel = GameObject.Find("MenuPanel");
        menuPanel.SetActive(false);
    }
    void Update()
    {
        if(Input.GetKeyDown(KeyCode.Escape) && isPlaying){
            if(menuPanel != null){
                Debug.Log("Escape menu");
                menuPanel.SetActive(true);
                m_AudioSourse.Pause();
                isPlaying = false;
                setIsPlay(isPlaying);
            }
        }
        else if(Input.GetKeyDown(KeyCode.Escape) && !isPlaying){
             if(menuPanel != null){
                menuPanel.SetActive(false);
                m_AudioSourse.Play();
                isPlaying = true;
                setIsPlay(isPlaying);
             }
        }
    }
    public void ContinueClick(){
        if(isPlaying){
            menuPanel.SetActive(true);
            m_AudioSourse.Pause();
            isPlaying = false;
            setIsPlay(isPlaying);
        }
        if(!isPlaying){
            menuPanel.SetActive(false);
            m_AudioSourse.Play();
            isPlaying = true;
            setIsPlay(isPlaying);
            float musicVol, soundVol;
            soundMixer.GetFloat("MasterVolume",  out soundVol);
            musicMixer.GetFloat("MasterVolume", out musicVol);
            SaveParams(musicVol,soundVol);
        }
    }
    public void OnSliderValueChangeSound(float value){
        soundMixer.SetFloat("MasterVolume", Mathf.Log10(value)*20);
    }
    public void OnSliderValueChangeMusic(float value){
        musicMixer.SetFloat("MasterVolume", Mathf.Log10(value)*20);
    }
    public void setIsPlay(bool val){ //from 6 lab
        gameObject.transform.parent.GetComponent<MoveController>().IsPlay = val;
        gameObject.transform.parent.GetComponent<PlayerAnimationController>().IsPlay = val;
        gameObject.transform.parent.GetComponent<ShowController>().IsPlay = val;
        GameObject[] massEnemy = GameObject.FindGameObjectsWithTag("Enemy");
        foreach(GameObject obj in massEnemy){
            obj.GetComponentInChildren<PatrolController>().IsPlay = val;
        }
        GameObject[] massBullets = GameObject.FindGameObjectsWithTag("Bullet");
        foreach(GameObject obj in massBullets){
            obj.GetComponent<BulletController>().IsPlay = val;
        }
         GameObject[] massCheck = GameObject.FindGameObjectsWithTag("Check");
        foreach(GameObject obj in massCheck){
            obj.GetComponent<CheckController>().IsPlay = val;
        }
    }
    private void SaveParams(float soundVol, float musicVol){
        PlayerPrefs.SetFloat("SoundVol", soundVol);
        PlayerPrefs.SetFloat("MusicVol", musicVol);
        PlayerPrefs.Save();
    }
    private void LoadParams(){
        if(PlayerPrefs.HasKey("SoundVol")){
            soundMixer.SetFloat("MasterVolume", Mathf.Log10(PlayerPrefs.GetFloat("SoundVol"))*20);
        }
        else{
            soundMixer.SetFloat("MasterVolume", Mathf.Log10(0)*20);
        }
        if(PlayerPrefs.HasKey("MusicVol")){
            musicMixer.SetFloat("MasterVolume", Mathf.Log10(PlayerPrefs.GetFloat("MusicVol"))*20);
        }
        else{
            musicMixer.SetFloat("MasterVolume", Mathf.Log10(0)*20);
    }
  }
  public void ExitGame(){
    Application.Quit();
  }
}
