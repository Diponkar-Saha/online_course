// Generated by view binder compiler. Do not edit!
package com.pioneeralpha.amarischool.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.card.MaterialCardView;
import com.pioneeralpha.amarischool.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import worker8.com.github.radiogroupplus.RadioGroupPlus;

public final class ItemQuestionBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatTextView question;

  @NonNull
  public final MaterialCardView questionCardFour;

  @NonNull
  public final MaterialCardView questionCardOne;

  @NonNull
  public final MaterialCardView questionCardThree;

  @NonNull
  public final MaterialCardView questionCardTwo;

  @NonNull
  public final AppCompatTextView questionFour;

  @NonNull
  public final AppCompatTextView questionNo;

  @NonNull
  public final AppCompatTextView questionOne;

  @NonNull
  public final AppCompatTextView questionThree;

  @NonNull
  public final AppCompatTextView questionTitle;

  @NonNull
  public final AppCompatTextView questionTwo;

  @NonNull
  public final RadioButton r1;

  @NonNull
  public final RadioButton r2;

  @NonNull
  public final RadioButton r3;

  @NonNull
  public final RadioButton r4;

  @NonNull
  public final RadioGroupPlus radio;

  private ItemQuestionBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatTextView question, @NonNull MaterialCardView questionCardFour,
      @NonNull MaterialCardView questionCardOne, @NonNull MaterialCardView questionCardThree,
      @NonNull MaterialCardView questionCardTwo, @NonNull AppCompatTextView questionFour,
      @NonNull AppCompatTextView questionNo, @NonNull AppCompatTextView questionOne,
      @NonNull AppCompatTextView questionThree, @NonNull AppCompatTextView questionTitle,
      @NonNull AppCompatTextView questionTwo, @NonNull RadioButton r1, @NonNull RadioButton r2,
      @NonNull RadioButton r3, @NonNull RadioButton r4, @NonNull RadioGroupPlus radio) {
    this.rootView = rootView;
    this.question = question;
    this.questionCardFour = questionCardFour;
    this.questionCardOne = questionCardOne;
    this.questionCardThree = questionCardThree;
    this.questionCardTwo = questionCardTwo;
    this.questionFour = questionFour;
    this.questionNo = questionNo;
    this.questionOne = questionOne;
    this.questionThree = questionThree;
    this.questionTitle = questionTitle;
    this.questionTwo = questionTwo;
    this.r1 = r1;
    this.r2 = r2;
    this.r3 = r3;
    this.r4 = r4;
    this.radio = radio;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemQuestionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemQuestionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_question, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemQuestionBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.question;
      AppCompatTextView question = rootView.findViewById(id);
      if (question == null) {
        break missingId;
      }

      id = R.id.question_card_four;
      MaterialCardView questionCardFour = rootView.findViewById(id);
      if (questionCardFour == null) {
        break missingId;
      }

      id = R.id.question_card_one;
      MaterialCardView questionCardOne = rootView.findViewById(id);
      if (questionCardOne == null) {
        break missingId;
      }

      id = R.id.question_card_three;
      MaterialCardView questionCardThree = rootView.findViewById(id);
      if (questionCardThree == null) {
        break missingId;
      }

      id = R.id.question_card_two;
      MaterialCardView questionCardTwo = rootView.findViewById(id);
      if (questionCardTwo == null) {
        break missingId;
      }

      id = R.id.question_four;
      AppCompatTextView questionFour = rootView.findViewById(id);
      if (questionFour == null) {
        break missingId;
      }

      id = R.id.question_no;
      AppCompatTextView questionNo = rootView.findViewById(id);
      if (questionNo == null) {
        break missingId;
      }

      id = R.id.question_one;
      AppCompatTextView questionOne = rootView.findViewById(id);
      if (questionOne == null) {
        break missingId;
      }

      id = R.id.question_three;
      AppCompatTextView questionThree = rootView.findViewById(id);
      if (questionThree == null) {
        break missingId;
      }

      id = R.id.question_title;
      AppCompatTextView questionTitle = rootView.findViewById(id);
      if (questionTitle == null) {
        break missingId;
      }

      id = R.id.question_two;
      AppCompatTextView questionTwo = rootView.findViewById(id);
      if (questionTwo == null) {
        break missingId;
      }

      id = R.id.r1;
      RadioButton r1 = rootView.findViewById(id);
      if (r1 == null) {
        break missingId;
      }

      id = R.id.r2;
      RadioButton r2 = rootView.findViewById(id);
      if (r2 == null) {
        break missingId;
      }

      id = R.id.r3;
      RadioButton r3 = rootView.findViewById(id);
      if (r3 == null) {
        break missingId;
      }

      id = R.id.r4;
      RadioButton r4 = rootView.findViewById(id);
      if (r4 == null) {
        break missingId;
      }

      id = R.id.radio;
      RadioGroupPlus radio = rootView.findViewById(id);
      if (radio == null) {
        break missingId;
      }

      return new ItemQuestionBinding((ConstraintLayout) rootView, question, questionCardFour,
          questionCardOne, questionCardThree, questionCardTwo, questionFour, questionNo,
          questionOne, questionThree, questionTitle, questionTwo, r1, r2, r3, r4, radio);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}