package com.example.kotlinsample;

public class MagicSwordDelegate implements ISword {
    ISword iSword;
    public MagicSwordDelegate(ISword iSword) {
        this.iSword = iSword;
    }

    @Override
    public void equip() {
        playWonderfulSound();
        iSword.equip();
    }

    public void playWonderfulSound() {
        System.out.println("짜잔");
    }
}