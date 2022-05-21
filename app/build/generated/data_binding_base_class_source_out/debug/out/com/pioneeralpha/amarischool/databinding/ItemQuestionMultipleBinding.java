// Generated by view binder compiler. Do not edit!
package com.pioneeralpha.amarischool.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class ItemQuestionMultipleBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatTextView question;

  @NonNull
  public final AppCompatTextView question1;

  @NonNull
  public final AppCompatTextView question2;

  @NonNull
  public final MaterialCardView questionBlankOne;

  @NonNull
  public final MaterialCardView questionBlankTwo;

  @NonNull
  public final MaterialCardView questionCardFive;

  @NonNull
  public final MaterialCardView questionCardFour;

  @NonNull
  public final MaterialCardView questionCardOne;

  @NonNull
  public final MaterialCardView questionCardSix;

  @NonNull
  public final MaterialCardView questionCardThree;

  @NonNull
  public final MaterialCardView questionCardTwo;

  @NonNull
  public final AppCompatTextView questionFive;

  @NonNull
  public final AppCompatTextView questionFour;

  @NonNull
  public final AppCompatTextView questionNo;

  @NonNull
  public final AppCompatTextView questionOne;

  @NonNull
  public final AppCompatTextView questionSix;

  @NonNull
  public final AppCompatTextView questionThree;

  @NonNull
  public final AppCompatTextView questionTitle;

  @NonNull
  public final AppCompatTextView questionTwo;

  private ItemQuestionMultipleBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatTextView question, @NonNull AppCompatTextView question1,
      @NonNull AppCompatTextView question2, @NonNull MaterialCardView questionBlankOne,
      @NonNull MaterialCardView questionBlankTwo, @NonNull MaterialCardView questionCardFive,
      @NonNull MaterialCardView questionCardFour, @NonNull MaterialCardView questionCardOne,
      @NonNull MaterialCardView questionCardSix, @NonNull MaterialCardView questionCardThree,
      @NonNull MaterialCardView questionCardTwo, @NonNull AppCompatTextView questionFive,
      @NonNull AppCompatTextView questionFour, @NonNull AppCompatTextView questionNo,
      @NonNull AppCompatTextView questionOne, @NonNull AppCompatTextView questionSix,
      @NonNull AppCompatTextView questionThree, @NonNull AppCompatTextView questionTitle,
      @NonNull AppCompatTextView questionTwo) {
    this.rootView = rootView;
    this.question = question;
    this.question1 = question1;
    this.question2 = question2;
    this.questionBlankOne = questionBlankOne;
    this.questionBlankTwo = questionBlankTwo;
    this.questionCardFive = questionCardFive;
    this.questionCardFour = questionCardFour;
    this.questionCardOne = questionCardOne;
    this.questionCardSix = questionCardSix;
    this.questionCardThree = questionCardThree;
    this.questionCardTwo = questionCardTwo;
    this.questionFive = questionFive;
    this.questionFour = questionFour;
    this.questionNo = questionNo;
    this.questionOne = questionOne;
    this.questionSix = questionSix;
    this.questionThree = questionThree;
    this.questionTitle = questionTitle;
    this.questionTwo = questionTwo;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemQuestionMultipleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemQuestionMultipleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_question_multiple, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemQuestionMultipleBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.question;
      AppCompatTextView question = rootView.findViewById(id);
      if (question == null) {
        break missingId;
      }

      id = R.id.question_1;
      AppCompatTextView question1 = rootView.findViewById(id);
      if (question1 == null) {
        break missingId;
      }

      id = R.id.question_2;
      AppCompatTextView question2 = rootView.findViewById(id);
      if (question2 == null) {
        break missingId;
      }

      id = R.id.question_blank_one;
      MaterialCardView questionBlankOne = rootView.findViewById(id);
      if (questionBlankOne == null) {
        break missingId;
      }

      id = R.id.question_blank_two;
      MaterialCardView questionBlankTwo = rootView.findViewById(id);
      if (questionBlankTwo == null) {
        break missingId;
      }

      id = R.id.question_card_five;
      MaterialCardView questionCardFive = rootView.findViewById(id);
      if (questionCardFive == null) {
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

      id = R.id.question_card_six;
      MaterialCardView questionCardSix = rootView.findViewById(id);
      if (questionCardSix == null) {
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

      id = R.id.question_five;
      AppCompatTextView questionFive = rootView.findViewById(id);
      if (questionFive == null) {
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

      id = R.id.question_six;
      AppCompatTextView questionSix = rootView.findViewById(id);
      if (questionSix == null) {
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

      return new ItemQuestionMultipleBinding((ConstraintLayout) rootView, question, question1,
          question2, questionBlankOne, questionBlankTwo, questionCardFive, questionCardFour,
          questionCardOne, questionCardSix, questionCardThree, questionCardTwo, questionFive,
          questionFour, questionNo, questionOne, questionSix, questionThree, questionTitle,
          questionTwo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
