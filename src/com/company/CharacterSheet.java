package com.company;

import java.util.ArrayList;

public interface CharacterSheet {

    String getCharacterName();
    void setCharacterName(String characterName);

    ArrayList<String> getCharacterInfos();
    void setCharacterInfos(ArrayList characterInfos);

    ArrayList<Integer> getCharacterStats();
    void setCharacterStats(ArrayList characterStats);

    int getCharacterInspiration();
    void setCharacterInspiration(int characterInspiration);

    int getCharacterProficiencyBonus();
    void setCharacterProficiencyBonus(int characterProficiencyBonus);

    int getCharacterArmorClass();
    void setCharacterArmorClass(int characterArmorClass);

    int getCharacterInitiative();
    void setCharacterInitiative(int characterInitiative);

    int getCharacterSpeed();
    void setCharacterSpeed(int characterSpeed);

    int getCharacterCurrentHP();
    void setCharacterCurrentHP(int characterCurrentHP);

    int getCharacterTemporaryHP();
    void setCharacterTemporaryHP(int characterTemporaryHP);

    int getCharacterHitDice();
    void setCharacterHitDice(int characterHitDice);

    int getCharacterDeathSaves();
    void setCharacterDeathSaves(int characterDeathSaves);

    String getCharacterPersonalityTraits();
    void setCharacterPersonalityTraits(String characterPersonalityTraits);

    String getCharacterIdeals();
    void setCharacterIdeals(String characterIdeals);

    String getCharacterBonds();
    void setCharacterBonds(String characterBonds);

    String getCharacterFlaws();
    void setCharacterFlaws(String characterFlaws);

    ArrayList<Integer> getCharacterSavingThrows();
    void setCharacterSavingThrows(ArrayList characterSavingThrows);

    ArrayList<Integer> getCharacterSkills();
    void setCharacterSkills(ArrayList characterSkills);

    int getCharacterPassiveWisdom();
    void setCharacterPassiveWisdom(int characterPassiveWisdom);

    ArrayList<String> getCharacterProficiencyAndLanguages();
    void setCharacterProficiencyAndLanguages(ArrayList characterProficiencyAndLanguages);

    ArrayList<String> getCharacterAttacksAndSpellcasting();
    void setCharacterAttacksAndSpellcasting(ArrayList characterAttacksAndSpellcasting);

    ArrayList<String> getCharacterEquipment();
    void setCharacterEquipment(ArrayList characterEquipment);

    ArrayList<String> getCharacterFeaturesAndTraits();
    void setCharacterFeaturesAndTraits(ArrayList characterFeaturesAndTraits);
}
