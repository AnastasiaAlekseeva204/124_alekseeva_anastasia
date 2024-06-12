using System;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.Audio;

public class SliderController : MonoBehaviour
{
    [SerializeField]
    private AudioMixer soundMixer;
    [SerializeField]
    private AudioMixer musicMixer;
    // Start is called before the first frame update
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    { }


     public void SliderChangeSound(float value){
        soundMixer.SetFloat("MasterVolume",value);
    }
     public void SliderChangeMusic(float value){
        musicMixer.SetFloat("MasterVolume",value);
    }
}
   
