// Generated by view binder compiler. Do not edit!
package com.pioneeralpha.amarischool.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.pioneeralpha.amarischool.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityEmailConfirmationBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnConfirm;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final EditText txtConfirmationCode;

  private ActivityEmailConfirmationBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnConfirm, @NonNull TextView textView2,
      @NonNull EditText txtConfirmationCode) {
    this.rootView = rootView;
    this.btnConfirm = btnConfirm;
    this.textView2 = textView2;
    this.txtConfirmationCode = txtConfirmationCode;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityEmailConfirmationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityEmailConfirmationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_email_confirmation, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityEmailConfirmationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnConfirm;
      Button btnConfirm = rootView.findViewById(id);
      if (btnConfirm == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = rootView.findViewById(id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.txtConfirmationCode;
      EditText txtConfirmationCode = rootView.findViewById(id);
      if (txtConfirmationCode == null) {
        break missingId;
      }

      return new ActivityEmailConfirmationBinding((ConstraintLayout) rootView, btnConfirm,
          textView2, txtConfirmationCode);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
