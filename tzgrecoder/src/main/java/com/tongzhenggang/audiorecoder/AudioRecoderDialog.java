package com.tongzhenggang.audiorecoder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * description: Dialog
 * author: tongzhenggang@126.com
 * date: 2018/2/1
 */
public class AudioRecoderDialog extends BasePopupWindow {

    private ImageView imageView;
    private TextView textView;

    public AudioRecoderDialog(Context context) {
        super(context);
        View contentView = LayoutInflater.from(context).inflate(R.layout.dialog_recoder, null);
        imageView = (ImageView) contentView.findViewById(R.id.progress);
        textView = (TextView) contentView.findViewById(R.id.text1);

        setContentView(contentView);
    }

    public void setLevel(int level) {
        Drawable drawable = imageView.getDrawable();
        drawable.setLevel(3000 + 6000 * level / 100);
    }

    public void setTime(long time) {
        textView.setText(ProgressTextUtils.getProgressText(time));
    }
}
