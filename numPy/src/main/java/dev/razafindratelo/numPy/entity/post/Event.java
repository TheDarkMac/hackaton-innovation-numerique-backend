package dev.razafindratelo.numPy.entity.post;

import dev.razafindratelo.numPy.entity.user.User;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DiscriminatorValue("EVENT")
public class Event extends Post{

    @Column(name = "event_status")
    private Status status;

    public Event(
            String postId,
            String title,
            String description,
            long like,
            long dislike,
            LocalDate publishedDate,
            User author,
            Status status
    ) {
        super(postId, title, description, like, dislike, publishedDate, author);
        this.status = status;
    }
}
