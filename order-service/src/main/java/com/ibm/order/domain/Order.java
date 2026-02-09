@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String product;

    private int quantity;

    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @Version
    private Long version;

    // getters & setters
}
