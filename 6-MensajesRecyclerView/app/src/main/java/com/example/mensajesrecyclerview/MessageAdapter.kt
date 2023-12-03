package com.example.mensajesrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mensajesrecyclerview.databinding.MensajeLayoutBinding

class MessageAdapter(private val messages: List<Message>) :
    RecyclerView.Adapter<MessageAdapter.MessageViewHolder>() {

    inner class MessageViewHolder( val binding: MensajeLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(message: Message) {
            binding.imgAuthor.setImageResource(message.imgAuthor)
            binding.textAuthorName.text = message.authorName
            binding.textMessage.text = message.text
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        val binding = MensajeLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MessageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val message = messages[position]
        with(holder.itemView) {
            holder.binding.imgAuthor.setImageResource(message.imgAuthor)
            holder.binding.textAuthorName.text = message.authorName
            holder.binding.textMessage.text = message.text
        }
    }

    override fun getItemCount(): Int {
        return messages.size
    }
}