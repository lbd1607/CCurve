package com.missouristate.davis916.ccurve;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Laura Davis CIS 262-902
 * 22 March 2018
 *
 */

public class FractalView extends View{
    private float x1;
    private float y1;
    private float x2;
    private float y2;
    public int level;

    private Fractal fractal;

    public FractalView (Context context){
        super(context);

        //Create a fractal object
        level = 2;
        fractal = new Fractal();
    }//end FractalView

    protected void onDraw(Canvas canvas){
        //Get the dimensions of the canvas
        x1 = canvas.getWidth() / 3;
        y1 = canvas.getHeight() / 4;
        x2 = canvas.getWidth() - x1;
        y2 = y1;

        //Fill the canvas with dark blue paint
        canvas.drawRGB(9,19,33);

        //Draw the C-Curve
        fractal.drawCCurve(canvas, x1, y1, x2, y2, level);
    }
}//end FractalView class
