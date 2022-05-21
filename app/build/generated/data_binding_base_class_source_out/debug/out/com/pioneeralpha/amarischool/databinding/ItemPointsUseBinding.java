// Generated by view binder compiler. Do not edit!
package com.pioneeralpha.amarischool.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.pioneeralpha.amarischool.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemPointsUseBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatTextView appCompatTextViewPointTitle;

  @NonNull
  public final AppCompatTextView appCompatTextViewTotalPoint;

  @NonNull
  public final CircleImageView circleImageView4;

  @NonNull
  public final AppCompatButton pointButton;

  private ItemPointsUseBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatTextView appCompatTextViewPointTitle,
      @NonNull AppCompatTextView appCompatTextViewTotalPoint,
      @NonNull CircleImageView circleImageView4, @NonNull AppCompatButton pointButton) {
    this.rootView = rootView;
    this.appCompatTextViewPointTitle = appCompatTextViewPointTitle;
    this.appCompatTextViewTotalPoint = appCompatTextViewTotalPoint;
    this.circleImageView4 = circleImageView4;
    this.pointButton = pointButton;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemPointsUseBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemPointsUseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_points_use, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemPointsUseBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appCompatTextViewPointTitle;
      AppCompatTextView appCompatTextViewPointTitle = rootView.findViewById(id);
      if (appCompatTextViewPointTitle == null) {
        break missingId;
      }

      id = R.id.appCompatTextViewTotalPoint;
      AppCompatTextView appCompatTextViewTotalPoint = rootView.findViewById(id);
      if (appCompatTextViewTotalPoint == null) {
        break missingId;
      }

      id = R.id.circleImageView4;
      CircleImageView circleImageView4 = rootView.findViewById(id);
      if (circleImageView4 == null) {
        break missingId;
      }

      id = R.id.pointButton;
      AppCompatButton pointButton = rootView.findViewById(id);
      if (pointButton == null) {
        break missingId;
      }

      return new ItemPointsUseBinding((ConstraintLayout) rootView, appCompatTextViewPointTitle,
          appCompatTextViewTotalPoint, circleImageView4, pointButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
