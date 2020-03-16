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

}
