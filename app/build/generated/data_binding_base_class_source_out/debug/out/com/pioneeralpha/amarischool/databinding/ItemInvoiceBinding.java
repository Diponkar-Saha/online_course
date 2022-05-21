// Generated by view binder compiler. Do not edit!
package com.pioneeralpha.amarischool.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.pioneeralpha.amarischool.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemInvoiceBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatImageView appCompatImageView7;

  @NonNull
  public final AppCompatTextView appCompatTextView30;

  @NonNull
  public final AppCompatTextView appCompatTextViewBuyTitle;

  private ItemInvoiceBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatImageView appCompatImageView7,
      @NonNull AppCompatTextView appCompatTextView30,
      @NonNull AppCompatTextView appCompatTextViewBuyTitle) {
    this.rootView = rootView;
    this.appCompatImageView7 = appCompatImageView7;
    this.appCompatTextView30 = appCompatTextView30;
    this.appCompatTextViewBuyTitle = appCompatTextViewBuyTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemInvoiceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemInvoiceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_invoice, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemInvoiceBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appCompatImageView7;
      AppCompatImageView appCompatImageView7 = rootView.findViewById(id);
      if (appCompatImageView7 == null) {
        break missingId;
      }

      id = R.id.appCompatTextView30;
      AppCompatTextView appCompatTextView30 = rootView.findViewById(id);
      if (appCompatTextView30 == null) {
        break missingId;
      }

      id = R.id.appCompatTextViewBuyTitle;
      AppCompatTextView appCompatTextViewBuyTitle = rootView.findViewById(id);
      if (appCompatTextViewBuyTitle == null) {
        break missingId;
      }

      return new ItemInvoiceBinding((ConstraintLayout) rootView, appCompatImageView7,
          appCompatTextView30, appCompatTextViewBuyTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
