// Generated by view binder compiler. Do not edit!
package com.pioneeralpha.amarischool.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import com.pioneeralpha.amarischool.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentWeek1Binding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final ConstraintLayout PointsAchievedLayout;

  @NonNull
  public final AppCompatImageView appCompatImageView10;

  @NonNull
  public final AppCompatTextView appCompatTextView40;

  @NonNull
  public final AppCompatTextView appCompatTextViewTime;

  @NonNull
  public final AppCompatTextView appCompatTextViewTimelive;

  @NonNull
  public final AppCompatTextView appCompatTextViewTimepa;

  @NonNull
  public final AppCompatTextView appCompatTextViewTitle;

  @NonNull
  public final AppCompatTextView appCompatTextViewTitlelive;

  @NonNull
  public final AppCompatTextView appCompatTextViewTitlepa;

  @NonNull
  public final AppCompatTextView appCompatTextViewlive;

  @NonNull
  public final AppCompatTextView appCompatTextViewpa;

  @NonNull
  public final AppCompatTextView appCompatTextViewv;

  @NonNull
  public final CircleImageView circleImageView6;

  @NonNull
  public final CircleImageView circleImageViewlive;

  @NonNull
  public final CircleImageView circleImageViewpa;

  @NonNull
  public final AppCompatTextView classlive;

  @NonNull
  public final AppCompatTextView classlivedate;

  @NonNull
  public final AppCompatTextView classlivelink;

  @NonNull
  public final AppCompatTextView classlivetime;

  @NonNull
  public final ConstraintLayout constraintLayout14;

  @NonNull
  public final Guideline guideline18;

  @NonNull
  public final Guideline guideline19;

  @NonNull
  public final Guideline guideline20;

  @NonNull
  public final ConstraintLayout instructorAnn;

  @NonNull
  public final ConstraintLayout liveClassLayout;

  @NonNull
  public final AppCompatTextView more;

  @NonNull
  public final AppCompatTextView paMidTitle;

  @NonNull
  public final AppCompatTextView paPointButton;

  @NonNull
  public final AppCompatTextView paPointText;

  @NonNull
  public final AppCompatTextView point;

  @NonNull
  public final AppCompatTextView weekdes;

  @NonNull
  public final ConstraintLayout wellcomeVideo;

  private FragmentWeek1Binding(@NonNull NestedScrollView rootView,
      @NonNull ConstraintLayout PointsAchievedLayout,
      @NonNull AppCompatImageView appCompatImageView10,
      @NonNull AppCompatTextView appCompatTextView40,
      @NonNull AppCompatTextView appCompatTextViewTime,
      @NonNull AppCompatTextView appCompatTextViewTimelive,
      @NonNull AppCompatTextView appCompatTextViewTimepa,
      @NonNull AppCompatTextView appCompatTextViewTitle,
      @NonNull AppCompatTextView appCompatTextViewTitlelive,
      @NonNull AppCompatTextView appCompatTextViewTitlepa,
      @NonNull AppCompatTextView appCompatTextViewlive,
      @NonNull AppCompatTextView appCompatTextViewpa, @NonNull AppCompatTextView appCompatTextViewv,
      @NonNull CircleImageView circleImageView6, @NonNull CircleImageView circleImageViewlive,
      @NonNull CircleImageView circleImageViewpa, @NonNull AppCompatTextView classlive,
      @NonNull AppCompatTextView classlivedate, @NonNull AppCompatTextView classlivelink,
      @NonNull AppCompatTextView classlivetime, @NonNull ConstraintLayout constraintLayout14,
      @NonNull Guideline guideline18, @NonNull Guideline guideline19,
      @NonNull Guideline guideline20, @NonNull ConstraintLayout instructorAnn,
      @NonNull ConstraintLayout liveClassLayout, @NonNull AppCompatTextView more,
      @NonNull AppCompatTextView paMidTitle, @NonNull AppCompatTextView paPointButton,
      @NonNull AppCompatTextView paPointText, @NonNull AppCompatTextView point,
      @NonNull AppCompatTextView weekdes, @NonNull ConstraintLayout wellcomeVideo) {
    this.rootView = rootView;
    this.PointsAchievedLayout = PointsAchievedLayout;
    this.appCompatImageView10 = appCompatImageView10;
    this.appCompatTextView40 = appCompatTextView40;
    this.appCompatTextViewTime = appCompatTextViewTime;
    this.appCompatTextViewTimelive = appCompatTextViewTimelive;
    this.appCompatTextViewTimepa = appCompatTextViewTimepa;
    this.appCompatTextViewTitle = appCompatTextViewTitle;
    this.appCompatTextViewTitlelive = appCompatTextViewTitlelive;
    this.appCompatTextViewTitlepa = appCompatTextViewTitlepa;
    this.appCompatTextViewlive = appCompatTextViewlive;
    this.appCompatTextViewpa = appCompatTextViewpa;
    this.appCompatTextViewv = appCompatTextViewv;
    this.circleImageView6 = circleImageView6;
    this.circleImageViewlive = circleImageViewlive;
    this.circleImageViewpa = circleImageViewpa;
    this.classlive = classlive;
    this.classlivedate = classlivedate;
    this.classlivelink = classlivelink;
    this.classlivetime = classlivetime;
    this.constraintLayout14 = constraintLayout14;
    this.guideline18 = guideline18;
    this.guideline19 = guideline19;
    this.guideline20 = guideline20;
    this.instructorAnn = instructorAnn;
    this.liveClassLayout = liveClassLayout;
    this.more = more;
    this.paMidTitle = paMidTitle;
    this.paPointButton = paPointButton;
    this.paPointText = paPointText;
    this.point = point;
    this.weekdes = weekdes;
    this.wellcomeVideo = wellcomeVideo;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentWeek1Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentWeek1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_week1, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentWeek1Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.PointsAchieved_layout;
      ConstraintLayout PointsAchievedLayout = rootView.findViewById(id);
      if (PointsAchievedLayout == null) {
        break missingId;
      }

      id = R.id.appCompatImageView10;
      AppCompatImageView appCompatImageView10 = rootView.findViewById(id);
      if (appCompatImageView10 == null) {
        break missingId;
      }

      id = R.id.appCompatTextView40;
      AppCompatTextView appCompatTextView40 = rootView.findViewById(id);
      if (appCompatTextView40 == null) {
        break missingId;
      }

      id = R.id.appCompatTextViewTime;
      AppCompatTextView appCompatTextViewTime = rootView.findViewById(id);
      if (appCompatTextViewTime == null) {
        break missingId;
      }

      id = R.id.appCompatTextViewTimelive;
      AppCompatTextView appCompatTextViewTimelive = rootView.findViewById(id);
      if (appCompatTextViewTimelive == null) {
        break missingId;
      }

      id = R.id.appCompatTextViewTimepa;
      AppCompatTextView appCompatTextViewTimepa = rootView.findViewById(id);
      if (appCompatTextViewTimepa == null) {
        break missingId;
      }

      id = R.id.appCompatTextViewTitle;
      AppCompatTextView appCompatTextViewTitle = rootView.findViewById(id);
      if (appCompatTextViewTitle == null) {
        break missingId;
      }

      id = R.id.appCompatTextViewTitlelive;
      AppCompatTextView appCompatTextViewTitlelive = rootView.findViewById(id);
      if (appCompatTextViewTitlelive == null) {
        break missingId;
      }

      id = R.id.appCompatTextViewTitlepa;
      AppCompatTextView appCompatTextViewTitlepa = rootView.findViewById(id);
      if (appCompatTextViewTitlepa == null) {
        break missingId;
      }

      id = R.id.appCompatTextViewlive;
      AppCompatTextView appCompatTextViewlive = rootView.findViewById(id);
      if (appCompatTextViewlive == null) {
        break missingId;
      }

      id = R.id.appCompatTextViewpa;
      AppCompatTextView appCompatTextViewpa = rootView.findViewById(id);
      if (appCompatTextViewpa == null) {
        break missingId;
      }

      id = R.id.appCompatTextViewv;
      AppCompatTextView appCompatTextViewv = rootView.findViewById(id);
      if (appCompatTextViewv == null) {
        break missingId;
      }

      id = R.id.circleImageView6;
      CircleImageView circleImageView6 = rootView.findViewById(id);
      if (circleImageView6 == null) {
        break missingId;
      }

      id = R.id.circleImageViewlive;
      CircleImageView circleImageViewlive = rootView.findViewById(id);
      if (circleImageViewlive == null) {
        break missingId;
      }

      id = R.id.circleImageViewpa;
      CircleImageView circleImageViewpa = rootView.findViewById(id);
      if (circleImageViewpa == null) {
        break missingId;
      }

      id = R.id.classlive;
      AppCompatTextView classlive = rootView.findViewById(id);
      if (classlive == null) {
        break missingId;
      }

      id = R.id.classlivedate;
      AppCompatTextView classlivedate = rootView.findViewById(id);
      if (classlivedate == null) {
        break missingId;
      }

      id = R.id.classlivelink;
      AppCompatTextView classlivelink = rootView.findViewById(id);
      if (classlivelink == null) {
        break missingId;
      }

      id = R.id.classlivetime;
      AppCompatTextView classlivetime = rootView.findViewById(id);
      if (classlivetime == null) {
        break missingId;
      }

      id = R.id.constraintLayout14;
      ConstraintLayout constraintLayout14 = rootView.findViewById(id);
      if (constraintLayout14 == null) {
        break missingId;
      }

      id = R.id.guideline18;
      Guideline guideline18 = rootView.findViewById(id);
      if (guideline18 == null) {
        break missingId;
      }

      id = R.id.guideline19;
      Guideline guideline19 = rootView.findViewById(id);
      if (guideline19 == null) {
        break missingId;
      }

      id = R.id.guideline20;
      Guideline guideline20 = rootView.findViewById(id);
      if (guideline20 == null) {
        break missingId;
      }

      id = R.id.instructorAnn;
      ConstraintLayout instructorAnn = rootView.findViewById(id);
      if (instructorAnn == null) {
        break missingId;
      }

      id = R.id.liveClass_layout;
      ConstraintLayout liveClassLayout = rootView.findViewById(id);
      if (liveClassLayout == null) {
        break missingId;
      }

      id = R.id.more;
      AppCompatTextView more = rootView.findViewById(id);
      if (more == null) {
        break missingId;
      }

      id = R.id.pa_mid_title;
      AppCompatTextView paMidTitle = rootView.findViewById(id);
      if (paMidTitle == null) {
        break missingId;
      }

      id = R.id.pa_point_button;
      AppCompatTextView paPointButton = rootView.findViewById(id);
      if (paPointButton == null) {
        break missingId;
      }

      id = R.id.pa_point_text;
      AppCompatTextView paPointText = rootView.findViewById(id);
      if (paPointText == null) {
        break missingId;
      }

      id = R.id.point;
      AppCompatTextView point = rootView.findViewById(id);
      if (point == null) {
        break missingId;
      }

      id = R.id.weekdes;
      AppCompatTextView weekdes = rootView.findViewById(id);
      if (weekdes == null) {
        break missingId;
      }

      id = R.id.wellcome_video;
      ConstraintLayout wellcomeVideo = rootView.findViewById(id);
      if (wellcomeVideo == null) {
        break missingId;
      }

      return new FragmentWeek1Binding((NestedScrollView) rootView, PointsAchievedLayout,
          appCompatImageView10, appCompatTextView40, appCompatTextViewTime,
          appCompatTextViewTimelive, appCompatTextViewTimepa, appCompatTextViewTitle,
          appCompatTextViewTitlelive, appCompatTextViewTitlepa, appCompatTextViewlive,
          appCompatTextViewpa, appCompatTextViewv, circleImageView6, circleImageViewlive,
          circleImageViewpa, classlive, classlivedate, classlivelink, classlivetime,
          constraintLayout14, guideline18, guideline19, guideline20, instructorAnn, liveClassLayout,
          more, paMidTitle, paPointButton, paPointText, point, weekdes, wellcomeVideo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
