package edu.up.cs301.spaceballs;

import android.graphics.Canvas;
import android.graphics.Color;
import android.view.MotionEvent;
import edu.up.cs301.animation.Animator;

/**
 * space animation
 *
 * @author Steve Vegdahl
 * @version September 2017
 *
 * This file is presently dummied up.
 */
public class SpaceAnimator implements Animator {

    /**
     * Interval between animation frames: .03 seconds (i.e., about 33 times
     * per second).
     *
     * @return the time interval between frames, in milliseconds.
     */
    @Override
    public int interval() {
        return 30;
    }

    /**
     * The background color: a light blue.
     *
     * @return the background color onto which we will draw the image.
     */
    @Override
    public int backgroundColor() {
        // create/return the background color
        return Color.rgb(0,20,55); // dark blue
    }

    /**
     * Action to perform on clock tick
     *
     * @param g the graphics object on which to draw
     */
    @Override
    public void tick(Canvas g) {
    }

    /**
     * Tells that we never pause.
     *
     * @return indication of whether to pause
     */
    @Override
    public boolean doPause() {
        return false;
    }

    /**
     * Tells that we never stop the animation.
     *
     * @return indication of whether to quit.
     */
    @Override
    public boolean doQuit() {
        return false;
    }

    /**
     * event method when screen is touched
     */
    @Override
    public void onTouch(MotionEvent event)
    {
    }

}//class SpaceAnimator
