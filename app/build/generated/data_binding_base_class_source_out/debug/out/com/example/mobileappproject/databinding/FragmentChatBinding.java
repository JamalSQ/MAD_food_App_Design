// Generated by view binder compiler. Do not edit!
package com.example.mobileappproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mobileappproject.R;
import com.google.android.material.appbar.MaterialToolbar;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentChatBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView ivAddChat;

  @NonNull
  public final ImageView ivEmptyChatPlaceholder;

  @NonNull
  public final MaterialToolbar materialToolbar;

  @NonNull
  public final RecyclerView rvChatFragment;

  @NonNull
  public final TextView tvEmptyChaTitle;

  @NonNull
  public final TextView tvEmptyChatDescription;

  private FragmentChatBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView ivAddChat,
      @NonNull ImageView ivEmptyChatPlaceholder, @NonNull MaterialToolbar materialToolbar,
      @NonNull RecyclerView rvChatFragment, @NonNull TextView tvEmptyChaTitle,
      @NonNull TextView tvEmptyChatDescription) {
    this.rootView = rootView;
    this.ivAddChat = ivAddChat;
    this.ivEmptyChatPlaceholder = ivEmptyChatPlaceholder;
    this.materialToolbar = materialToolbar;
    this.rvChatFragment = rvChatFragment;
    this.tvEmptyChaTitle = tvEmptyChaTitle;
    this.tvEmptyChatDescription = tvEmptyChatDescription;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentChatBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentChatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_chat, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentChatBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ivAddChat;
      ImageView ivAddChat = ViewBindings.findChildViewById(rootView, id);
      if (ivAddChat == null) {
        break missingId;
      }

      id = R.id.ivEmptyChatPlaceholder;
      ImageView ivEmptyChatPlaceholder = ViewBindings.findChildViewById(rootView, id);
      if (ivEmptyChatPlaceholder == null) {
        break missingId;
      }

      id = R.id.materialToolbar;
      MaterialToolbar materialToolbar = ViewBindings.findChildViewById(rootView, id);
      if (materialToolbar == null) {
        break missingId;
      }

      id = R.id.rvChatFragment;
      RecyclerView rvChatFragment = ViewBindings.findChildViewById(rootView, id);
      if (rvChatFragment == null) {
        break missingId;
      }

      id = R.id.tvEmptyChaTitle;
      TextView tvEmptyChaTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvEmptyChaTitle == null) {
        break missingId;
      }

      id = R.id.tvEmptyChatDescription;
      TextView tvEmptyChatDescription = ViewBindings.findChildViewById(rootView, id);
      if (tvEmptyChatDescription == null) {
        break missingId;
      }

      return new FragmentChatBinding((ConstraintLayout) rootView, ivAddChat, ivEmptyChatPlaceholder,
          materialToolbar, rvChatFragment, tvEmptyChaTitle, tvEmptyChatDescription);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
