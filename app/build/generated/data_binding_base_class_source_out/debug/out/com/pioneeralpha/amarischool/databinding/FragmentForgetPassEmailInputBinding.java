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

public final class FragmentForgetPassEmailInputBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final TextInputLayout email;

  @NonNull
  public final ImageView imageView11;

  @NonNull
  public final ImageView imageView12;

  @NonNull
  public final Button sendConfirmCodeBtnn;

  @NonNull
  public final TextView textView16;

  @NonNull
  public final TextView textView17;

  @NonNull
  public final TextView textView18;

  @NonNull
  public final TextInputEditText txtEmail;

  private FragmentForgetPassEmailInputBinding(@NonNull FrameLayout rootView,
      @NonNull TextInputLayout email, @NonNull ImageView imageView11,
      @NonNull ImageView imageView12, @NonNull Button sendConfirmCodeBtnn,
      @NonNull TextView textView16, @NonNull TextView textView17, @NonNull TextView textView18,
      @NonNull TextInputEditText txtEmail) {
    this.rootView = rootView;
    this.email = email;
    this.imageView11 = imageView11;
    this.imageView12 = imageView12;
    this.sendConfirmCodeBtnn = sendConfirmCodeBtnn;
    this.textView16 = textView16;
    this.textView17 = textView17;
    this.textView18 = textView18;
    this.txtEmail = txtEmail;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentForgetPassEmailInputBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentForgetPassEmailInputBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_forget_pass_email_input, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentForgetPassEmailInputBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.email;
      TextInputLayout email = rootView.findViewById(id);
      if (email == null) {
        break missingId;
      }

      id = R.id.imageView11;
      ImageView imageView11 = rootView.findViewById(id);
      if (imageView11 == null) {
        break missingId;
      }

      id = R.id.imageView12;
      ImageView imageView12 = rootView.findViewById(id);
      if (imageView12 == null) {
        break missingId;
      }

      id = R.id.send_confirm_code_btnn;
      Button sendConfirmCodeBtnn = rootView.findViewById(id);
      if (sendConfirmCodeBtnn == null) {
        break missingId;
      }

      id = R.id.textView16;
      TextView textView16 = rootView.findViewById(id);
      if (textView16 == null) {
        break missingId;
      }

      id = R.id.textView17;
      TextView textView17 = rootView.findViewById(id);
      if (textView17 == null) {
        break missingId;
      }

      id = R.id.textView18;
      TextView textView18 = rootView.findViewById(id);
      if (textView18 == null) {
        break missingId;
      }

      id = R.id.txtEmail;
      TextInputEditText txtEmail = rootView.findViewById(id);
      if (txtEmail == null) {
        break missingId;
      }

      return new FragmentForgetPassEmailInputBinding((FrameLayout) rootView, email, imageView11,
          imageView12, sendConfirmCodeBtnn, textView16, textView17, textView18, txtEmail);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
