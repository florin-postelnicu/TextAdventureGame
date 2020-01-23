
import java.util.*;
import java.io.*;


public class Player {

   private String name;
    private int health;
    private int damage;

    public Player(String n){
        name = n;
    }

    public Player() {

    }

    public void PlayerHealth(int h){
        health= h;
    }

    public void PlayerDmg(int d){
        damage = d;
    }
    public int  GetHealth( ){
        return health;
    }
    public String GetName(){
        return name;
    }

    public int GetDamage(){
        return damage;
    }

    public void TakeDamage(int d){
        health -= d;
    }
    public int Attack(){
        return damage;
    }
    public void GainHealth(int z){
        health +=z;
    }
}
