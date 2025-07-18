package untitled.infra;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import untitled.domain.Book.Book;;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BookInfo {
    private Long id;
    private String title;
    private Long authorId;
    private String authorName;
    private String category;
    private Integer price;
    private String imageUrl;
    private String summary;
    private Long views;

    public static BookInfo of(Book book){
        return new BookInfo(
            book.getId(),
            book.getTitle(),
            book.getAuthorId(),
            book.getAuthorName(),
            book.getCategory(),
            book.getPrice(),
            book.getImageUrl(),
            book.getSummary(),
            book.getViews()
        );
    }
}
