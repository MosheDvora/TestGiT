package commoshe.testgit;

import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;

/**
 * Created by Administrator on 9/19/13.
 */
public class BGColorAnimation extends Animation{

        private View view;
        private int currentRedColor;

        //The steps to skip between colors
        private static int STEP_SIZE=30;
        private static int ANIMATION_DURATION=50;

        public BGColorAnimation(View view) {
            this.view=view;
            setRepeatCount(255/STEP_SIZE);
            setFillAfter(true);
            setInterpolator(new AccelerateInterpolator());

            setAnimationListener(new MyAnimationListener());
        }



    public void test(){




        }

}
