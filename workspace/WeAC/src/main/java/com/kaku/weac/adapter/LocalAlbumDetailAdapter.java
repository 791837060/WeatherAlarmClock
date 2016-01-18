/*
 * Copyright (c) 2016. Kaku咖枯 Inc. All rights reserved.
 */
package com.kaku.weac.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.kaku.weac.R;
import com.kaku.weac.bean.ImageItem;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

/**
 * 本地相册详细图片适配器
 *
 * @author 咖枯
 * @version 1.0 2016/1/15
 */
public class LocalAlbumDetailAdapter extends ArrayAdapter<ImageItem> {

    private Context mContext;

    public LocalAlbumDetailAdapter(Context context, List<ImageItem> localAlbumList) {
        super(context, 0, localAlbumList);
        mContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(
                    R.layout.gv_local_album_detail, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        ImageItem imageItem = getItem(position);
        if (null != imageItem) {
            String imagePath = imageItem.getImagePath();
            if (!TextUtils.isEmpty(imagePath)) {
                ImageLoader.getInstance().displayImage("file://" + imagePath,
                        viewHolder.mPictureIv);
            }
        }
        return convertView;
    }

    public class ViewHolder {
        public final ImageView mPictureIv;

        public ViewHolder(View view) {
            mPictureIv = (ImageView) view.findViewById(R.id.picture_iv);
        }
    }
}