// Generated by view binder compiler. Do not edit!
package com.pioneeralpha.amarischool.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.pioneeralpha.amarischool.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentClubPartnershipSettingsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton appCompatButton;

  @NonNull
  public final Guideline guideline7;

  @NonNull
  public final Guideline guideline8;

  @NonNull
  public final TextInputEditText nameOnCardEditText;

  @NonNull
  public final TextInputEditText nameOnCardEditText1;

  @NonNull
  public final TextInputEditText nameOnCardEditText11;

  @NonNull
  public final TextInputLayout nameOnCardTextInputLayout;

  @NonNull
  public final TextInputLayout nameOnCardTextInputLayout1;

  @NonNull
  public final TextInputLayout nameOnCardTextInputLayout11;

  @NonNull
  public final AppCompatButton requestConfirmationButton;

  @NonNull
  public final TextView textView30;

  @NonNull
  public final TextView textView301;

  private FragmentClubPartnershipSettingsBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatButton appCompatButton, @NonNull Guideline guideline7,
      @NonNull Guideline guideline8, @NonNull TextInputEditText nameOnCardEditText,
      @NonNull TextInputEditText nameOnCardEditText1,
      @NonNull TextInputEditText nameOnCardEditText11,
      @NonNull TextInputLayout nameOnCardTextInputLayout,
      @NonNull TextInputLayout nameOnCardTextInputLayout1,
      @NonNull TextInputLayout nameOnCardTextInputLayout11,
      @NonNull AppCompatButton requestConfirmationButton, @NonNull TextView textView30,
      @NonNull TextView textView301) {
    this.rootView = rootView;
    this.appCompatButton = appCompatButton;
    this.guideline7 = guideline7;
    this.guideline8 = guideline8;
    this.nameOnCardEditText = nameOnCardEditText;
    this.nameOnCardEditText1 = nameOnCardEditText1;
    this.nameOnCardEditText11 = nameOnCardEditText11;
    this.nameOnCardTextInputLayout = nameOnCardTextInputLayout;
    this.nameOnCardTextInputLayout1 = nameOnCardTextInputLayout1;
    this.nameOnCardTextInputLayout11 = nameOnCardTextInputLayout11;
    this.requestConfirmationButton = requestConfirmationButton;
    this.textView30 = textView30;
    this.textView301 = textView301;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentClubPartnershipSettingsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentClubPartnershipSettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_club_partnership_settings, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentClubPartnershipSettingsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appCompatButton;
      AppCompatButton appCompatButton = rootView.findViewById(id);
      if (appCompatButton == null) {
        break missingId;
      }

      id = R.id.guideline7;
      Guideline guideline7 = rootView.findViewById(id);
      if (guideline7 == null) {
        break missingId;
      }

      id = R.id.guideline8;
      Guideline guideline8 = rootView.findViewById(id);
      if (guideline8 == null) {
        break missingId;
      }

      id = R.id.nameOnCardEditText;
      TextInputEditText nameOnCardEditText = rootView.findViewById(id);
      if (nameOnCardEditText == null) {
        break missingId;
      }

      id = R.id.nameOnCardEditText1;
      TextInputEditText nameOnCardEditText1 = rootView.findViewById(id);
      if (nameOnCardEditText1 == null) {
        break missingId;
      }

      id = R.id.nameOnCardEditText11;
      TextInputEditText nameOnCardEditText11 = rootView.findViewById(id);
      if (nameOnCardEditText11 == null) {
        break missingId;
      }

      id = R.id.nameOnCardTextInputLayout;
      TextInputLayout nameOnCardTextInputLayout = rootView.findViewById(id);
      if (nameOnCardTextInputLayout == null) {
        break missingId;
      }

      id = R.id.nameOnCardTextInputLayout1;
      TextInputLayout nameOnCardTextInputLayout1 = rootView.findViewById(id);
      if (nameOnCardTextInputLayout1 == null) {
        break missingId;
      }

      id = R.id.nameOnCardTextInputLayout11;
      TextInputLayout nameOnCardTextInputLayout11 = rootView.findViewById(id);
      if (nameOnCardTextInputLayout11 == null) {
        break missingId;
      }

      id = R.id.requestConfirmationButton;
      AppCompatButton requestConfirmationButton = rootView.findViewById(id);
      if (requestConfirmationButton == null) {
        break missingId;
      }

      id = R.id.textView30;
      TextView textView30 = rootView.findViewById(id);
      if (textView30 == null) {
        break missingId;
      }

      id = R.id.textView301;
      TextView textView301 = rootView.findViewById(id);
      if (textView301 == null) {
        break missingId;
      }

      return new FragmentClubPartnershipSettingsBinding((ConstraintLayout) rootView,
          appCompatButton, guideline7, guideline8, nameOnCardEditText, nameOnCardEditText1,
          nameOnCardEditText11, nameOnCardTextInputLayout, nameOnCardTextInputLayout1,
          nameOnCardTextInputLayout11, requestConfirmationButton, textView30, textView301);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
