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
import com.pioneeralpha.amarischool.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPasswordUpdatedBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ImageView imageView12;

  @NonNull
  public final Button sendConfirmCodeBtn;

  @NonNull
  public final TextView textView16;

  @NonNull
  public final TextView textView18;

  private ActivityPasswordUpdatedBinding(@NonNull FrameLayout rootView,
      @NonNull ImageView imageView12, @NonNull Button sendConfirmCodeBtn,
      @NonNull TextView textView16, @NonNull TextView textView18) {
    this.rootView = rootView;
    this.imageView12 = imageView12;
    this.sendConfirmCodeBtn = sendConfirmCodeBtn;
    this.textView16 = textView16;
    this.textView18 = textView18;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPasswordUpdatedBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPasswordUpdatedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_password_updated, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPasswordUpdatedBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView12;
      ImageView imageView12 = rootView.findViewById(id);
      if (imageView12 == null) {
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

      return new ActivityPasswordUpdatedBinding((FrameLayout) rootView, imageView12,
          sendConfirmCodeBtn, textView16, textView18);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
