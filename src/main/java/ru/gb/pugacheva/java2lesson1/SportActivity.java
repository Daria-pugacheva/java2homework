package ru.gb.pugacheva.java2lesson1;

public interface SportActivity {
    void run(SportTrack type);

    void jump(Wall type);

    boolean isAbleToDoThisSport();
}
