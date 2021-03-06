// Generated by view binder compiler. Do not edit!
package com.pioneeralpha.amarischool.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.pioneeralpha.amarischool.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentForgetPassNewPassInputBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final TextInputLayout confirmPassTextInput;

  @NonNull
  public final ImageView imageView12;

  @NonNull
  public final TextInputLayout password;

  @NonNull
  public final Button sendConfirmCodeBtn;

  @NonNull
  public final TextView textView16;

  @NonNull
  public final TextView textView18;

  @NonNull
  public final TextInputEditText txtConfirmNewPass;

  @NonNull
  public final TextInputEditText txtnewPass;

  private FragmentForgetPassNewPassInputBinding(@NonNull FrameLayout rootView,
      @NonNull TextInputLayout confirmPassTextInput, @NonNull ImageView imageView12,
      @NonNull TextInputLayout password, @NonNull Button sendConfirmCodeBtn,
      @NonNull TextView textView16, @NonNull TextView textView18,
      @NonNull TextInputEditText txtConfirmNewPass, @NonNull TextInputEditText txtnewPass) {
    this.rootView = rootView;
    this.confirmPassTextInput = confirmPassTextInput;
    this.imageView12 = imageView12;
    this.password = password;
    this.sendConfirmCodeBtn = sendConfirmCodeBtn;
    this.textView16 = textView16;
    this.textView18 = textView18;
    this.txtConfirmNewPass = txtConfirmNewPass;
    this.txtnewPass = txtnewPass;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentForgetPassNewPassInputBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentForgetPassNewPassInputBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_forget_pass_new_pass_input, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentForgetPassNewPassInputBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.confirm_pass_text_input;
      TextInputLayout confirmPassTextInput = rootView.findViewById(id);
      if (confirmPassTextInput == null) {
        break missingId;
      }

      id = R.id.imageView12;
      ImageView imageView12 = rootView.findViewById(id);
      if (imageView12 == null) {
        break missingId;
      }

      id = R.id.password;
      TextInputLayout password = rootView.findViewById(id);
      if (password == null) {
        break missingId;
      }

      id = R.id.send_confirm_code_btn;
      Button sendConfirmCodeBtn = rootView.findViewById(id);
      if (sendConfirmCodeBtn == null) {
        break missingId;
      }

      id = R.id.textView16;
      TextView textView16 = rootView.findViewById(id);
      if (textView16 == null) {
        break missingId;
      }

      id = R.id.textView18;
      TextView textView18 = rootView.findViewById(id);
      if (textView18 == null) {
        break missingId;
      }

      id = R.id.txtConfirmNewPass;
      TextInputEditText txtConfirmNewPass = rootView.findViewById(id);
      if (txtConfirmNewPass == null) {
        break missingId;
      }

      id = R.id.txtnewPass;
      TextInputEditText txtnewPass = rootView.findViewById(id);
      if (txtnewPass == null) {
        break missingId;
      }

      return new FragmentForgetPassNewPassInputBinding((FrameLayout) rootView, confirmPassTextInput,
          imageView12, password, sendConfirmCodeBtn, textView16, textView18, txtConfirmNewPass,
          txtnewPass);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
