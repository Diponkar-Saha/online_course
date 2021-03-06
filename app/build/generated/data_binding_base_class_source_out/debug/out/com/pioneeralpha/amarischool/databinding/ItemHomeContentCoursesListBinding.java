// Generated by view binder compiler. Do not edit!
package com.pioneeralpha.amarischool.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.pioneeralpha.amarischool.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemHomeContentCoursesListBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView cardView5;

  @NonNull
  public final ImageView cartButton;

  @NonNull
  public final CardView costContainer;

  @NonNull
  public final ImageView coursePreview;

  @NonNull
  public final TextView courseTeacher;

  @NonNull
  public final TextView courseTitle;

  @NonNull
  public final TextView duration;

  @NonNull
  public final ImageView heartButton;

  @NonNull
  public final AppCompatTextView previousPrice;

  @NonNull
  public final TextView price;

  @NonNull
  public final TextView studentsEnrolled;

  private ItemHomeContentCoursesListBinding(@NonNull ConstraintLayout rootView,
      @NonNull CardView cardView5, @NonNull ImageView cartButton, @NonNull CardView costContainer,
      @NonNull ImageView coursePreview, @NonNull TextView courseTeacher,
      @NonNull TextView courseTitle, @NonNull TextView duration, @NonNull ImageView heartButton,
      @NonNull AppCompatTextView previousPrice, @NonNull TextView price,
      @NonNull TextView studentsEnrolled) {
    this.rootView = rootView;
    this.cardView5 = cardView5;
    this.cartButton = cartButton;
    this.costContainer = costContainer;
    this.coursePreview = coursePreview;
    this.courseTeacher = courseTeacher;
    this.courseTitle = courseTitle;
    this.duration = duration;
    this.heartButton = heartButton;
    this.previousPrice = previousPrice;
    this.price = price;
    this.studentsEnrolled = studentsEnrolled;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemHomeContentCoursesListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemHomeContentCoursesListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_home_content_courses_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemHomeContentCoursesListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardView5;
      CardView cardView5 = rootView.findViewById(id);
      if (cardView5 == null) {
        break missingId;
      }

      id = R.id.cart_button;
      ImageView cartButton = rootView.findViewById(id);
      if (cartButton == null) {
        break missingId;
      }

      id = R.id.cost_container;
      CardView costContainer = rootView.findViewById(id);
      if (costContainer == null) {
        break missingId;
      }

      id = R.id.course_preview;
      ImageView coursePreview = rootView.findViewById(id);
      if (coursePreview == null) {
        break missingId;
      }

      id = R.id.course_teacher;
      TextView courseTeacher = rootView.findViewById(id);
      if (courseTeacher == null) {
        break missingId;
      }

      id = R.id.course_title;
      TextView courseTitle = rootView.findViewById(id);
      if (courseTitle == null) {
        break missingId;
      }

      id = R.id.duration;
      TextView duration = rootView.findViewById(id);
      if (duration == null) {
        break missingId;
      }

      id = R.id.heart_button;
      ImageView heartButton = rootView.findViewById(id);
      if (heartButton == null) {
        break missingId;
      }

      id = R.id.previousPrice;
      AppCompatTextView previousPrice = rootView.findViewById(id);
      if (previousPrice == null) {
        break missingId;
      }

      id = R.id.price;
      TextView price = rootView.findViewById(id);
      if (price == null) {
        break missingId;
      }

      id = R.id.students_enrolled;
      TextView studentsEnrolled = rootView.findViewById(id);
      if (studentsEnrolled == null) {
        break missingId;
      }

      return new ItemHomeContentCoursesListBinding((ConstraintLayout) rootView, cardView5,
          cartButton, costContainer, coursePreview, courseTeacher, courseTitle, duration,
          heartButton, previousPrice, price, studentsEnrolled);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
