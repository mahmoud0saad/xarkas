package com.mahmoudsaad.xarkas.ui.base;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

/**
 * Created on : Feb 11, 2019
 * Author     : mahmoud saad
 */
public abstract class BaseViewHolder extends RecyclerView.ViewHolder {

  private int mCurrentPosition;

  public BaseViewHolder(View itemView) {
    super(itemView);
  }

  protected abstract void clear();

  public void onBind(int position) {
    mCurrentPosition = position;
    clear();
  }

  public int getCurrentPosition() {
    return mCurrentPosition;
  }
}