// Generated by view binder compiler. Do not edit!
package com.pioneeralpha.amarischool.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class ListNewThreadBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView createdBy;

  @NonNull
  public final TextView createdName;

  @NonNull
  public final TextView date;

  @NonNull
  public final Guideline guideline2;

  @NonNull
  public final Guideline guideline3;

  @NonNull
  public final TextView numberofThread;

  @NonNull
  public final TextView reply;

  @NonNull
  public final TextView staffCreated;

  @NonNull
  public final TextView subDesc;

  @NonNull
  public final TextView threadTitle;

  @NonNull
  public final TextView totalreply;

  @NonNull
  public final TextView views;

  private ListNewThreadBinding(@NonNull ConstraintLayout rootView, @NonNull TextView createdBy,
      @NonNull TextView createdName, @NonNull TextView date, @NonNull Guideline guideline2,
      @NonNull Guideline guideline3, @NonNull TextView numberofThread, @NonNull TextView reply,
      @NonNull TextView staffCreated, @NonNull TextView subDesc, @NonNull TextView threadTitle,
      @NonNull TextView totalreply, @NonNull TextView views) {
    this.rootView = rootView;
    this.createdBy = createdBy;
    this.createdName = createdName;
    this.date = date;
    this.guideline2 = guideline2;
    this.guideline3 = guideline3;
    this.numberofThread = numberofThread;
    this.reply = reply;
    this.staffCreated = staffCreated;
    this.subDesc = subDesc;
    this.threadTitle = threadTitle;
    this.totalreply = totalreply;
    this.views = views;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ListNewThreadBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListNewThreadBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.list_new_thread, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListNewThreadBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.createdBy;
      TextView createdBy = rootView.findViewById(id);
      if (createdBy == null) {
        break missingId;
      }

      id = R.id.createdName;
      TextView createdName = rootView.findViewById(id);
      if (createdName == null) {
        break missingId;
      }

      id = R.id.date;
      TextView date = rootView.findViewById(id);
      if (date == null) {
        break missingId;
      }

      id = R.id.guideline2;
      Guideline guideline2 = rootView.findViewById(id);
      if (guideline2 == null) {
        break missingId;
      }

      id = R.id.guideline3;
      Guideline guideline3 = rootView.findViewById(id);
      if (guideline3 == null) {
        break missingId;
      }

      id = R.id.numberofThread;
      TextView numberofThread = rootView.findViewById(id);
      if (numberofThread == null) {
        break missingId;
      }

      id = R.id.reply;
      TextView reply = rootView.findViewById(id);
      if (reply == null) {
        break missingId;
      }

      id = R.id.staff_created;
      TextView staffCreated = rootView.findViewById(id);
      if (staffCreated == null) {
        break missingId;
      }

      id = R.id.subDesc;
      TextView subDesc = rootView.findViewById(id);
      if (subDesc == null) {
        break missingId;
      }

      id = R.id.threadTitle;
      TextView threadTitle = rootView.findViewById(id);
      if (threadTitle == null) {
        break missingId;
      }

      id = R.id.totalreply;
      TextView totalreply = rootView.findViewById(id);
      if (totalreply == null) {
        break missingId;
      }

      id = R.id.views;
      TextView views = rootView.findViewById(id);
      if (views == null) {
        break missingId;
      }

      return new ListNewThreadBinding((ConstraintLayout) rootView, createdBy, createdName, date,
          guideline2, guideline3, numberofThread, reply, staffCreated, subDesc, threadTitle,
          totalreply, views);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
