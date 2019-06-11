package cn.edu.swufe.mymusic.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.text.InputType;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;

import cn.edu.swufe.mymusic.R;

    //输入框小图标input_icon
//输入提示内容input_hint
//密码：is_password
    public class InputView  extends FrameLayout {
        private int inputIcon;
        private String inputHint;
        private boolean isPassword;

        private View mView;
        private ImageView mIvIcon;
        private EditText mEtInput;
        public InputView(@NonNull Context context) {
            super(context);
            init(context,null);
        }

        public InputView(@NonNull Context context, @Nullable AttributeSet attrs) {
            super(context, attrs);
            init(context,attrs);
        }

        public InputView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
            super(context, attrs, defStyleAttr);
            init(context,attrs);
        }

        @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
        public InputView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
            super(context, attrs, defStyleAttr, defStyleRes);
            init(context,attrs);
        }


        //inputView的初始化方法
        private void init(Context context, AttributeSet attrs){
            if(attrs==null) return;
            //获取自定义属性
            TypedArray typedArray=context.obtainStyledAttributes(attrs,R.styleable.inputView);
            inputIcon=typedArray.getResourceId(R.styleable.inputView_input_icon,R.mipmap.picture_phone);
            inputHint=typedArray.getString(R.styleable.inputView_input_hint);
            isPassword=typedArray.getBoolean(R.styleable.inputView_is_password,false);//默认值false

            typedArray.recycle();//使用之后释放掉
            //绑定Layout布局
            mView= LayoutInflater.from(context).inflate(R.layout.input_view,this,false);
            mView.findViewById(R.id.iv_icon);
            mEtInput=mView.findViewById(R.id.et_input);
//布局关联属性
            mIvIcon.setImageResource(inputIcon);
            mEtInput.setHint(inputHint);
            mEtInput.setInputType(isPassword ? InputType.TYPE_CLASS_TEXT |InputType.TYPE_TEXT_VARIATION_PASSWORD :InputType.TYPE_CLASS_PHONE);//为真时显示密文，为假时显示手机号

            addView(mView);//将mView放入InputView中
        }

        //返回输入内容
        public String getInputStr(){
            return mEtInput.getText().toString().trim();
        }
    }


