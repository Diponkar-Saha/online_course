// Generated by view binder compiler. Do not edit!
package com.pioneeralpha.amarischool.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.pioneeralpha.amarischool.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ListForumBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView date;

  @NonNull
  public final TextView forumTitle;

  @NonNull
  public final Guideline guideline2;

  @NonNull
  public final TextView numberofThread;

  @NonNull
  public final ImageView rightArrow;

  @NonNull
  public final TextView subDesc;

  @NonNull
  public final TextView threads;

  private ListForumBinding(@NonNull ConstraintLayout rootView, @NonNull TextView date,
      @NonNull TextView forumTitle, @NonNull Guideline guideline2, @NonNull TextView numberofThread,
      @NonNull ImageView rightArrow, @NonNull TextView subDesc, @NonNull TextView threads) {
    this.rootView = rootView;
    this.date = date;
    this.forumTitle = forumTitle;
    this.guideline2 = guideline2;
    this.numberofThread = numberofThread;
    this.rightArrow = rightArrow;
    this.subDesc = subDesc;
    this.threads = threads;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ListForumBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListForumBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.list_forum, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListForumBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.date;
      TextView date = rootView.findViewById(id);
      if (date == null) {
        break missingId;
      }

      id = R.id.forumTitle;
      TextView forumTitle = rootView.findViewById(id);
      if (forumTitle == null) {
        break missingId;
      }

      id = R.id.guideline2;
      Guideline guideline2 = rootView.findViewById(id);
      if (guideline2 == null) {
        break missingId;
      }

      id = R.id.numberofThread;
      TextView numberofThread = rootView.findViewById(id);
      if (numberofThread == null) {
        break missingId;
      }

      id = R.id.rightArrow;
      ImageView rightArrow = rootView.findViewById(id);
      if (rightArrow == null) {
        break missingId;
      }

      id = R.id.subDesc;
      TextView subDesc = rootView.findViewById(id);
      if (subDesc == null) {
        break missingId;
      }

      id = R.id.threads;
      TextView threads = rootView.findViewById(id);
      if (threads == null) {
        break missingId;
      }

      return new ListForumBinding((ConstraintLayout) rootView, date, forumTitle, guideline2,
          numberofThread, rightArrow, subDesc, threads);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
