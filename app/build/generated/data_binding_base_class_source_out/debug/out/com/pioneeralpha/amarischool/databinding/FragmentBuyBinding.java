// Generated by view binder compiler. Do not edit!
package com.pioneeralpha.amarischool.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.pioneeralpha.amarischool.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentBuyBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final AppCompatImageView amex;

  @NonNull
  public final AppCompatButton appCompatButton3;

  @NonNull
  public final AppCompatEditText appCompatCouponCode;

  @NonNull
  public final AppCompatTextView appCompatTextView24;

  @NonNull
  public final AppCompatTextView appCompatTextView25;

  @NonNull
  public final AppCompatTextView appCompatTextView26;

  @NonNull
  public final AppCompatTextView appCompatTextView27;

  @NonNull
  public final AppCompatTextView bkash11;

  @NonNull
  public final AppCompatTextView card;

  @NonNull
  public final ConstraintLayout cardDetailHeader;

  @NonNull
  public final ConstraintLayout cardDetails;

  @NonNull
  public final RecyclerView cardDetailsRv;

  @NonNull
  public final ConstraintLayout cons1;

  @NonNull
  public final ConstraintLayout consBkash11;

  @NonNull
  public final ConstraintLayout consCard;

  @NonNull
  public final ConstraintLayout consNogod11;

  @NonNull
  public final ItemBuyProfileBinding courseBuyHeader;

  @NonNull
  public final Guideline guideline11;

  @NonNull
  public final Guideline guideline12;

  @NonNull
  public final ConstraintLayout havecoupon;

  @NonNull
  public final ConstraintLayout havecoupondetails;

  @NonNull
  public final AppCompatImageView mastercard;

  @NonNull
  public final RadioGroup membervoucher;

  @NonNull
  public final AppCompatTextView nogod;

  @NonNull
  public final RadioButton radio2;

  @NonNull
  public final RadioButton radio22;

  @NonNull
  public final RadioButton radio23;

  @NonNull
  public final RadioGroup radioGroup1;

  @NonNull
  public final RadioGroup rclub;

  @NonNull
  public final AppCompatImageView skrill;

  @NonNull
  public final View view1;

  @NonNull
  public final AppCompatImageView visa;

  private FragmentBuyBinding(@NonNull NestedScrollView rootView, @NonNull AppCompatImageView amex,
      @NonNull AppCompatButton appCompatButton3, @NonNull AppCompatEditText appCompatCouponCode,
      @NonNull AppCompatTextView appCompatTextView24,
      @NonNull AppCompatTextView appCompatTextView25,
      @NonNull AppCompatTextView appCompatTextView26,
      @NonNull AppCompatTextView appCompatTextView27, @NonNull AppCompatTextView bkash11,
      @NonNull AppCompatTextView card, @NonNull ConstraintLayout cardDetailHeader,
      @NonNull ConstraintLayout cardDetails, @NonNull RecyclerView cardDetailsRv,
      @NonNull ConstraintLayout cons1, @NonNull ConstraintLayout consBkash11,
      @NonNull ConstraintLayout consCard, @NonNull ConstraintLayout consNogod11,
      @NonNull ItemBuyProfileBinding courseBuyHeader, @NonNull Guideline guideline11,
      @NonNull Guideline guideline12, @NonNull ConstraintLayout havecoupon,
      @NonNull ConstraintLayout havecoupondetails, @NonNull AppCompatImageView mastercard,
      @NonNull RadioGroup membervoucher, @NonNull AppCompatTextView nogod,
      @NonNull RadioButton radio2, @NonNull RadioButton radio22, @NonNull RadioButton radio23,
      @NonNull RadioGroup radioGroup1, @NonNull RadioGroup rclub,
      @NonNull AppCompatImageView skrill, @NonNull View view1, @NonNull AppCompatImageView visa) {
    this.rootView = rootView;
    this.amex = amex;
    this.appCompatButton3 = appCompatButton3;
    this.appCompatCouponCode = appCompatCouponCode;
    this.appCompatTextView24 = appCompatTextView24;
    this.appCompatTextView25 = appCompatTextView25;
    this.appCompatTextView26 = appCompatTextView26;
    this.appCompatTextView27 = appCompatTextView27;
    this.bkash11 = bkash11;
    this.card = card;
    this.cardDetailHeader = cardDetailHeader;
    this.cardDetails = cardDetails;
    this.cardDetailsRv = cardDetailsRv;
    this.cons1 = cons1;
    this.consBkash11 = consBkash11;
    this.consCard = consCard;
    this.consNogod11 = consNogod11;
    this.courseBuyHeader = courseBuyHeader;
    this.guideline11 = guideline11;
    this.guideline12 = guideline12;
    this.havecoupon = havecoupon;
    this.havecoupondetails = havecoupondetails;
    this.mastercard = mastercard;
    this.membervoucher = membervoucher;
    this.nogod = nogod;
    this.radio2 = radio2;
    this.radio22 = radio22;
    this.radio23 = radio23;
    this.radioGroup1 = radioGroup1;
    this.rclub = rclub;
    this.skrill = skrill;
    this.view1 = view1;
    this.visa = visa;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentBuyBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentBuyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_buy, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentBuyBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.amex;
      AppCompatImageView amex = rootView.findViewById(id);
      if (amex == null) {
        break missingId;
      }

      id = R.id.appCompatButton3;
      AppCompatButton appCompatButton3 = rootView.findViewById(id);
      if (appCompatButton3 == null) {
        break missingId;
      }

      id = R.id.appCompatCouponCode;
      AppCompatEditText appCompatCouponCode = rootView.findViewById(id);
      if (appCompatCouponCode == null) {
        break missingId;
      }

      id = R.id.appCompatTextView24;
      AppCompatTextView appCompatTextView24 = rootView.findViewById(id);
      if (appCompatTextView24 == null) {
        break missingId;
      }

      id = R.id.appCompatTextView25;
      AppCompatTextView appCompatTextView25 = rootView.findViewById(id);
      if (appCompatTextView25 == null) {
        break missingId;
      }

      id = R.id.appCompatTextView26;
      AppCompatTextView appCompatTextView26 = rootView.findViewById(id);
      if (appCompatTextView26 == null) {
        break missingId;
      }

      id = R.id.appCompatTextView27;
      AppCompatTextView appCompatTextView27 = rootView.findViewById(id);
      if (appCompatTextView27 == null) {
        break missingId;
      }

      id = R.id.bkash11;
      AppCompatTextView bkash11 = rootView.findViewById(id);
      if (bkash11 == null) {
        break missingId;
      }

      id = R.id.card;
      AppCompatTextView card = rootView.findViewById(id);
      if (card == null) {
        break missingId;
      }

      id = R.id.card_detail_header;
      ConstraintLayout cardDetailHeader = rootView.findViewById(id);
      if (cardDetailHeader == null) {
        break missingId;
      }

      id = R.id.card_details;
      ConstraintLayout cardDetails = rootView.findViewById(id);
      if (cardDetails == null) {
        break missingId;
      }

      id = R.id.card_details_rv;
      RecyclerView cardDetailsRv = rootView.findViewById(id);
      if (cardDetailsRv == null) {
        break missingId;
      }

      id = R.id.cons1;
      ConstraintLayout cons1 = rootView.findViewById(id);
      if (cons1 == null) {
        break missingId;
      }

      id = R.id.cons_bkash11;
      ConstraintLayout consBkash11 = rootView.findViewById(id);
      if (consBkash11 == null) {
        break missingId;
      }

      id = R.id.cons_card;
      ConstraintLayout consCard = rootView.findViewById(id);
      if (consCard == null) {
        break missingId;
      }

      id = R.id.cons_nogod11;
      ConstraintLayout consNogod11 = rootView.findViewById(id);
      if (consNogod11 == null) {
        break missingId;
      }

      id = R.id.course_buy_header;
      View courseBuyHeader = rootView.findViewById(id);
      if (courseBuyHeader == null) {
        break missingId;
      }
      ItemBuyProfileBinding binding_courseBuyHeader = ItemBuyProfileBinding.bind(courseBuyHeader);

      id = R.id.guideline11;
      Guideline guideline11 = rootView.findViewById(id);
      if (guideline11 == null) {
        break missingId;
      }

      id = R.id.guideline12;
      Guideline guideline12 = rootView.findViewById(id);
      if (guideline12 == null) {
        break missingId;
      }

      id = R.id.havecoupon;
      ConstraintLayout havecoupon = rootView.findViewById(id);
      if (havecoupon == null) {
        break missingId;
      }

      id = R.id.havecoupondetails;
      ConstraintLayout havecoupondetails = rootView.findViewById(id);
      if (havecoupondetails == null) {
        break missingId;
      }

      id = R.id.mastercard;
      AppCompatImageView mastercard = rootView.findViewById(id);
      if (mastercard == null) {
        break missingId;
      }

      id = R.id.membervoucher;
      RadioGroup membervoucher = rootView.findViewById(id);
      if (membervoucher == null) {
        break missingId;
      }

      id = R.id.nogod;
      AppCompatTextView nogod = rootView.findViewById(id);
      if (nogod == null) {
        break missingId;
      }

      id = R.id.radio2;
      RadioButton radio2 = rootView.findViewById(id);
      if (radio2 == null) {
        break missingId;
      }

      id = R.id.radio22;
      RadioButton radio22 = rootView.findViewById(id);
      if (radio22 == null) {
        break missingId;
      }

      id = R.id.radio23;
      RadioButton radio23 = rootView.findViewById(id);
      if (radio23 == null) {
        break missingId;
      }

      id = R.id.radioGroup1;
      RadioGroup radioGroup1 = rootView.findViewById(id);
      if (radioGroup1 == null) {
        break missingId;
      }

      id = R.id.rclub;
      RadioGroup rclub = rootView.findViewById(id);
      if (rclub == null) {
        break missingId;
      }

      id = R.id.skrill;
      AppCompatImageView skrill = rootView.findViewById(id);
      if (skrill == null) {
        break missingId;
      }

      id = R.id.view1;
      View view1 = rootView.findViewById(id);
      if (view1 == null) {
        break missingId;
      }

      id = R.id.visa;
      AppCompatImageView visa = rootView.findViewById(id);
      if (visa == null) {
        break missingId;
      }

      return new FragmentBuyBinding((NestedScrollView) rootView, amex, appCompatButton3,
          appCompatCouponCode, appCompatTextView24, appCompatTextView25, appCompatTextView26,
          appCompatTextView27, bkash11, card, cardDetailHeader, cardDetails, cardDetailsRv, cons1,
          consBkash11, consCard, consNogod11, binding_courseBuyHeader, guideline11, guideline12,
          havecoupon, havecoupondetails, mastercard, membervoucher, nogod, radio2, radio22, radio23,
          radioGroup1, rclub, skrill, view1, visa);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
