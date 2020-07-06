package com.company;

public class Main {

    public static void main(String[] args) {
    Boss boss = new Boss();
    Weapon weapon = new Weapon("Pistol", "desertEagle");
    boss.setHealth(800);
    boss.setDamage(30);
    boss.setWeapon(weapon);

        System.out.println(boss.getHealth());
        System.out.println(boss.getDamage());
        System.out.println("Название оужия босса - "+boss.getWeapon().getName() +
                "\nТип оружия босса -" + boss.getWeapon().getType());


    }
}
