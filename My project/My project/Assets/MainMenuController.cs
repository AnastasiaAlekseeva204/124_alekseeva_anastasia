using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class MainMenuController : MonoBehaviour
{
    // Start is called before the first frame update
    public void Startgame()
    {
        SceneManager.LoadScene("Level1", LoadSceneMode.Single);
    }

    public void ExitGame()
    {
        Application.Quit();
    }
    public void SettingsGame(){
        SceneManager.LoadScene("Settings",LoadSceneMode.Single);
    }

}