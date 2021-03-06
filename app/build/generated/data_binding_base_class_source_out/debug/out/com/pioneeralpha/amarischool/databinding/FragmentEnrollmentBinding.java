// Generated by view binder compiler. Do not edit!
package com.pioneeralpha.amarischool.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.card.MaterialCardView;
import com.pioneeralpha.amarischool.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentEnrollmentBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final AppCompatButton cancel;

  @NonNull
  public final MaterialCardView cardView;

  @NonNull
  public final ConstraintLayout constraintLayout13;

  @NonNull
  public final ConstraintLayout mainCons;

  @NonNull
  public final ProgressBar progressbar;

  @NonNull
  public final RecyclerView recyclerview;

  @NonNull
  public final AppCompatTextView rulesDescriptionTv;

  @NonNull
  public final AppCompatTextView rulesTv;

  @NonNull
  public final AppCompatButton submitQuestion;

  @NonNull
  public final AppCompatTextView timeCountTitle;

  @NonNull
  public final AppCompatTextView titleTv;

  private FragmentEnrollmentBinding(@NonNull NestedScrollView rootView,
      @NonNull AppCompatButton cancel, @NonNull MaterialCardView cardView,
      @NonNull ConstraintLayout constraintLayout13, @NonNull ConstraintLayout mainCons,
      @NonNull ProgressBar progressbar, @NonNull RecyclerView recyclerview,
      @NonNull AppCompatTextView rulesDescriptionTv, @NonNull AppCompatTextView rulesTv,
      @NonNull AppCompatButton submitQuestion, @NonNull AppCompatTextView timeCountTitle,
      @NonNull AppCompatTextView titleTv) {
    this.rootView = rootView;
    this.cancel = cancel;
    this.cardView = cardView;
    this.constraintLayout13 = constraintLayout13;
    this.mainCons = mainCons;
    this.progressbar = progressbar;
    this.recyclerview = recyclerview;
    this.rulesDescriptionTv = rulesDescriptionTv;
    this.rulesTv = rulesTv;
    this.submitQuestion = submitQuestion;
    this.timeCountTitle = timeCountTitle;
    this.titleTv = titleTv;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentEnrollmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentEnrollmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_enrollment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentEnrollmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cancel;
      AppCompatButton cancel = rootView.findViewById(id);
      if (cancel == null) {
        break missingId;
      }

      id = R.id.card_view;
      MaterialCardView cardView = rootView.findViewById(id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.constraintLayout13;
      ConstraintLayout constraintLayout13 = rootView.findViewById(id);
      if (constraintLayout13 == null) {
        break missingId;
      }

      id = R.id.main_cons;
      ConstraintLayout mainCons = rootView.findViewById(id);
      if (mainCons == null) {
        break missingId;
      }

      id = R.id.progressbar;
      ProgressBar progressbar = rootView.findViewById(id);
      if (progressbar == null) {
        break missingId;
      }

      id = R.id.recyclerview;
      RecyclerView recyclerview = rootView.findViewById(id);
      if (recyclerview == null) {
        break missingId;
      }

      id = R.id.rules_description_tv;
      AppCompatTextView rulesDescriptionTv = rootView.findViewById(id);
      if (rulesDescriptionTv == null) {
        break missingId;
      }

      id = R.id.rules_tv;
      AppCompatTextView rulesTv = rootView.findViewById(id);
      if (rulesTv == null) {
        break missingId;
      }

      id = R.id.submit_question;
      AppCompatButton submitQuestion = rootView.findViewById(id);
      if (submitQuestion == null) {
        break missingId;
      }

      id = R.id.time_count_title;
      AppCompatTextView timeCountTitle = rootView.findViewById(id);
      if (timeCountTitle == null) {
        break missingId;
      }

      id = R.id.title_tv;
      AppCompatTextView titleTv = rootView.findViewById(id);
      if (titleTv == null) {
        break missingId;
      }

      return new FragmentEnrollmentBinding((NestedScrollView) rootView, cancel, cardView,
          constraintLayout13, mainCons, progressbar, recyclerview, rulesDescriptionTv, rulesTv,
          submitQuestion, timeCountTitle, titleTv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
