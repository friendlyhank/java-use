package com.hank;

import static org.junit.Assert.assertTrue;

import lombok.Getter;
import lombok.Setter;
import org.junit.Test;

import java.awt.*;

@Getter
@Setter
public class LombokTest
{
    private int x;
    private int y;
    private Color color;

    public static void main(String[] args) {
        LombokTest l = new LombokTest();
        l.setX(1);
        l.setY(2);

        System.out.println(l.getX());
        System.out.println(l.getY());
    }
}
