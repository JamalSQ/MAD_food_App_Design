// Generated by view binder compiler. Do not edit!
package com.example.mobileappproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mobileappproject.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegPgNo11Binding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button btnPg11;

  @NonNull
  public final EditText editTextTextPassword;

  @NonNull
  public final EditText emailEditText;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView tvDet;

  @NonNull
  public final TextView tvForgetPassword;

  @NonNull
  public final TextView tvGoogle;

  @NonNull
  public final TextView tvOr;

  @NonNull
  public final TextView tvSignInn;

  private ActivityRegPgNo11Binding(@NonNull ScrollView rootView, @NonNull Button btnPg11,
      @NonNull EditText editTextTextPassword, @NonNull EditText emailEditText,
      @NonNull ImageView imageView, @NonNull TextView tvDet, @NonNull TextView tvForgetPassword,
      @NonNull TextView tvGoogle, @NonNull TextView tvOr, @NonNull TextView tvSignInn) {
    this.rootView = rootView;
    this.btnPg11 = btnPg11;
    this.editTextTextPassword = editTextTextPassword;
    this.emailEditText = emailEditText;
    this.imageView = imageView;
    this.tvDet = tvDet;
    this.tvForgetPassword = tvForgetPassword;
    this.tvGoogle = tvGoogle;
    this.tvOr = tvOr;
    this.tvSignInn = tvSignInn;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegPgNo11Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegPgNo11Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_reg_pg_no11, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegPgNo11Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnPg11;
      Button btnPg11 = ViewBindings.findChildViewById(rootView, id);
      if (btnPg11 == null) {
        break missingId;
      }

      id = R.id.editTextTextPassword;
      EditText editTextTextPassword = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPassword == null) {
        break missingId;
      }

      id = R.id.emailEditText;
      EditText emailEditText = ViewBindings.findChildViewById(rootView, id);
      if (emailEditText == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.tv_det;
      TextView tvDet = ViewBindings.findChildViewById(rootView, id);
      if (tvDet == null) {
        break missingId;
      }

      id = R.id.tv_forget_password;
      TextView tvForgetPassword = ViewBindings.findChildViewById(rootView, id);
      if (tvForgetPassword == null) {
        break missingId;
      }

      id = R.id.tv_google;
      TextView tvGoogle = ViewBindings.findChildViewById(rootView, id);
      if (tvGoogle == null) {
        break missingId;
      }

      id = R.id.tv_or;
      TextView tvOr = ViewBindings.findChildViewById(rootView, id);
      if (tvOr == null) {
        break missingId;
      }

      id = R.id.tv_SignInn;
      TextView tvSignInn = ViewBindings.findChildViewById(rootView, id);
      if (tvSignInn == null) {
        break missingId;
      }

      return new ActivityRegPgNo11Binding((ScrollView) rootView, btnPg11, editTextTextPassword,
          emailEditText, imageView, tvDet, tvForgetPassword, tvGoogle, tvOr, tvSignInn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
