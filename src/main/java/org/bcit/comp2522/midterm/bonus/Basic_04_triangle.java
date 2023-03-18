package org.bcit.comp2522.midterm.bonus;

public class Basic_04_triangle extends Basic_04_shape implements Basic_04_areaCalculator_interface {
    //another shape that just calls super's constructor and has its own version of getArea
    public Basic_04_triangle(int length, int width) {
        super(length, width);
    }


    @Override
    public double getArea() {
        return (length * width) / 2;
    }
}
