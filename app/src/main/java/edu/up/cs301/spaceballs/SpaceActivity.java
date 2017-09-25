package edu.up.cs301.spaceballs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import edu.up.cs301.animation.AnimationSurface;

/**
 * activity class for space animation
 *
 * @author Steve Vegdahl
 * @version September 2017
 */
public class SpaceActivity extends AppCompatActivity {

    // the animator
    private TestAnimator animator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space);

        // Connect the animation surface with the animator
        AnimationSurface mySurface = (AnimationSurface) this.findViewById(R.id.animationSurface);
        animator = new TestAnimator();
        mySurface.setAnimator(animator);
    }
}
