/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thelabyrinth;

public class MageEnemy extends Enemy {
    public MageEnemy(int x, int y, GamePanel game) {
        super(x, y, game);
        this.hp = 40;
        this.damage = 8;
    }
}