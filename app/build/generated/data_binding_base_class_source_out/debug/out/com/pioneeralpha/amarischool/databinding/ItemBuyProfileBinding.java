// Generated by view binder compiler. Do not edit!
package com.pioneeralpha.amarischool.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.pioneeralpha.amarischool.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemBuyProfileBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton appCompatCouponCheckPreviousIssue;

  @NonNull
  public final AppCompatButton appCompatCouponReportIssue;

  @NonNull
  public final AppCompatTextView appCompatTextView28;

  @NonNull
  public final AppCompatTextView appCompatTextViewContact;

  @NonNull
  public final AppCompatTextView appCompatTextViewGmail;

  @NonNull
  public final AppCompatTextView appCompatTextViewName;

  @NonNull
  public final AppCompatTextView appCompatTextViewOrder;

  @NonNull
  public final CircleImageView circleImageView5;

  private ItemBuyProfileBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatButton appCompatCouponCheckPreviousIssue,
      @NonNull AppCompatButton appCompatCouponReportIssue,
      @NonNull AppCompatTextView appCompatTextView28,
      @NonNull AppCompatTextView appCompatTextViewContact,
      @NonNull AppCompatTextView appCompatTextViewGmail,
      @NonNull AppCompatTextView appCompatTextViewName,
      @NonNull AppCompatTextView appCompatTextViewOrder,
      @NonNull CircleImageView circleImageView5) {
    this.rootView = rootView;
    this.appCompatCouponCheckPreviousIssue = appCompatCouponCheckPreviousIssue;
    this.appCompatCouponReportIssue = appCompatCouponReportIssue;
    this.appCompatTextView28 = appCompatTextView28;
    this.appCompatTextViewContact = appCompatTextViewContact;
    this.appCompatTextViewGmail = appCompatTextViewGmail;
    this.appCompatTextViewName = appCompatTextViewName;
    this.appCompatTextViewOrder = appCompatTextViewOrder;
    this.circleImageView5 = circleImageView5;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemBuyProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemBuyProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_buy_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemBuyProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appCompatCouponCheckPreviousIssue;
      AppCompatButton appCompatCouponCheckPreviousIssue = rootView.findViewById(id);
      if (appCompatCouponCheckPreviousIssue == null) {
        break missingId;
      }

      id = R.id.appCompatCouponReportIssue;
      AppCompatButton appCompatCouponReportIssue = rootView.findViewById(id);
      if (appCompatCouponReportIssue == null) {
        break missingId;
      }

      id = R.id.appCompatTextView28;
      AppCompatTextView appCompatTextView28 = rootView.findViewById(id);
      if (appCompatTextView28 == null) {
        break missingId;
      }

      id = R.id.appCompatTextViewContact;
      AppCompatTextView appCompatTextViewContact = rootView.findViewById(id);
      if (appCompatTextViewContact == null) {
        break missingId;
      }

      id = R.id.appCompatTextViewGmail;
      AppCompatTextView appCompatTextViewGmail = rootView.findViewById(id);
      if (appCompatTextViewGmail == null) {
        break missingId;
      }

      id = R.id.appCompatTextViewName;
      AppCompatTextView appCompatTextViewName = rootView.findViewById(id);
      if (appCompatTextViewName == null) {
        break missingId;
      }

      id = R.id.appCompatTextViewOrder;
      AppCompatTextView appCompatTextViewOrder = rootView.findViewById(id);
      if (appCompatTextViewOrder == null) {
        break missingId;
      }

      id = R.id.circleImageView5;
      CircleImageView circleImageView5 = rootView.findViewById(id);
      if (circleImageView5 == null) {
        break missingId;
      }

      return new ItemBuyProfileBinding((ConstraintLayout) rootView,
          appCompatCouponCheckPreviousIssue, appCompatCouponReportIssue, appCompatTextView28,
          appCompatTextViewContact, appCompatTextViewGmail, appCompatTextViewName,
          appCompatTextViewOrder, circleImageView5);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}