package com.lht.employ.test;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by LHT on 2017/12/12.
 */

public class AnimFragment extends Fragment implements View.OnClickListener {

    View page;
    ImageView img;
    Button setbtn, valuebtn;
    TextView textView;
    private TextView mText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        page = inflater.inflate(R.layout.anim_layout, container, false);

        initView(page);
        return page;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.setbtn:
                Animation animation = AnimationUtils.loadAnimation(getActivity(), R.anim.set_anim);
                img.startAnimation(animation);
                break;

            case R.id.valuebtn:
                ValueAnimator myAnimator = ValueAnimator.ofObject(new MyEvaluator(), "hello", "world");
                myAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                    @Override
                    public void onAnimationUpdate(ValueAnimator animation) {
                        String animatedValue = (String) animation.getAnimatedValue();
                        //img.setText(animatedValue);
                    }
                });
                break;
        }
    }

    private void initView(View page) {

        mText = (TextView) page.findViewById(R.id.text);
        setbtn = page.findViewById(R.id.setbtn);
        setbtn.setOnClickListener(this);

        valuebtn = page.findViewById(R.id.valuebtn);
        valuebtn.setOnClickListener(this);

        img = page.findViewById(R.id.img);
    }

    class MyEvaluator implements TypeEvaluator<String> {

        @Override
        public String evaluate(float fraction, String startValue, String endValue) {

            String result = startValue + fraction;
            if (fraction == 0) {
                result = "start";
            } else if (fraction == 1) {
                result += endValue;
            }
            return result;
        }
    }
}
