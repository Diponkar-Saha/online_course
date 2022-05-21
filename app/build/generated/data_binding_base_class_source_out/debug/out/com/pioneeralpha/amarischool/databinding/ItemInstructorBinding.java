// Generated by view binder compiler. Do not edit!
package com.pioneeralpha.amarischool.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.pioneeralpha.amarischool.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemInstructorBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatTextView appCompatTextView11;

  @NonNull
  public final AppCompatTextView appCompatTextView12;

  @NonNull
  public final CircleImageView circleImageView2;

  @NonNull
  public final RatingBar courseRatingBar;

  @NonNull
  public final AppCompatTextView email;

  @NonNull
  public final AppCompatImageView fb;

  @NonNull
  public final Guideline guideline6;

  @NonNull
  public final AppCompatImageView instra;

  @NonNull
  public final AppCompatImageView linkedin;

  @NonNull
  public final AppCompatTextView map;

  @NonNull
  public final AppCompatTextView profession;

  @NonNull
  public final AppCompatTextView rattingTotal;

  @NonNull
  public final AppCompatImageView twitter;

  private ItemInstructorBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatTextView appCompatTextView11,
      @NonNull AppCompatTextView appCompatTextView12, @NonNull CircleImageView circleImageView2,
      @NonNull RatingBar courseRatingBar, @NonNull AppCompatTextView email,
      @NonNull AppCompatImageView fb, @NonNull Guideline guideline6,
      @NonNull AppCompatImageView instra, @NonNull AppCompatImageView linkedin,
      @NonNull AppCompatTextView map, @NonNull AppCompatTextView profession,
      @NonNull AppCompatTextView rattingTotal, @NonNull AppCompatImageView twitter) {
    this.rootView = rootView;
    this.appCompatTextView11 = appCompatTextView11;
    this.appCompatTextView12 = appCompatTextView12;
    this.circleImageView2 = circleImageView2;
    this.courseRatingBar = courseRatingBar;
    this.email = email;
    this.fb = fb;
    this.guideline6 = guideline6;
    this.instra = instra;
    this.linkedin = linkedin;
    this.map = map;
    this.profession = profession;
    this.rattingTotal = rattingTotal;
    this.twitter = twitter;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemInstructorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemInstructorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_instructor, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemInstructorBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appCompatTextView11;
      AppCompatTextView appCompatTextView11 = rootView.findViewById(id);
      if (appCompatTextView11 == null) {
        break missingId;
      }

      id = R.id.appCompatTextView12;
      AppCompatTextView appCompatTextView12 = rootView.findViewById(id);
      if (appCompatTextView12 == null) {
        break missingId;
      }

      id = R.id.circleImageView2;
      CircleImageView circleImageView2 = rootView.findViewById(id);
      if (circleImageView2 == null) {
        break missingId;
      }

      id = R.id.courseRatingBar;
      RatingBar courseRatingBar = rootView.findViewById(id);
      if (courseRatingBar == null) {
        break missingId;
      }

      id = R.id.email;
      AppCompatTextView email = rootView.findViewById(id);
      if (email == null) {
        break missingId;
      }

      id = R.id.fb;
      AppCompatImageView fb = rootView.findViewById(id);
      if (fb == null) {
        break missingId;
      }

      id = R.id.guideline6;
      Guideline guideline6 = rootView.findViewById(id);
      if (guideline6 == null) {
        break missingId;
      }

      id = R.id.instra;
      AppCompatImageView instra = rootView.findViewById(id);
      if (instra == null) {
        break missingId;
      }

      id = R.id.linkedin;
      AppCompatImageView linkedin = rootView.findViewById(id);
      if (linkedin == null) {
        break missingId;
      }

      id = R.id.map;
      AppCompatTextView map = rootView.findViewById(id);
      if (map == null) {
        break missingId;
      }

      id = R.id.profession;
      AppCompatTextView profession = rootView.findViewById(id);
      if (profession == null) {
        break missingId;
      }

      id = R.id.ratting_total;
      AppCompatTextView rattingTotal = rootView.findViewById(id);
      if (rattingTotal == null) {
        break missingId;
      }

      id = R.id.twitter;
      AppCompatImageView twitter = rootView.findViewById(id);
      if (twitter == null) {
        break missingId;
      }

      return new ItemInstructorBinding((ConstraintLayout) rootView, appCompatTextView11,
          appCompatTextView12, circleImageView2, courseRatingBar, email, fb, guideline6, instra,
          linkedin, map, profession, rattingTotal, twitter);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}