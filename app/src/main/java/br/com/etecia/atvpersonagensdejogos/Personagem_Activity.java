package br.com.etecia.atvpersonagensdejogos;


import androidx.appcompat.app.AppCompatActivity;

public class Personagem_Activity extends AppCompatActivity {
}


    private TextView;
    private ImageView;
    Toolbar idToolBar;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personagens_layout);

        txtTitulo = findViewById(R.id.txtIdTitulo);
        txtDescricao = findViewById(R.id.txtIdDescricao);
        txtCategoria = findViewById(R.id.txtIdCategoria);
        imagemLivro = findViewById(R.id.idImgLivroN);
        idToolBar = findViewById(R.id.idToolBarLivros);

        idToolBar.setNavigationOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        startActivity(new Intent(getApplicationContext(),
        MainActivity.class));
        }
        });

        idToolBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
@Override
public boolean onMenuItemClick(MenuItem item) {

        switch (item.getItemId()) {
        case R.id.mComprar:
        Toast.makeText(getApplicationContext(),
        "Cliquei em comprar",
        Toast.LENGTH_SHORT).show();
        break;
        case R.id.mCarrinho:
        Toast.makeText(getApplicationContext(),
        "Cliquei em carrinho",
        Toast.LENGTH_SHORT).show();
        break;
        case R.id.mFav:
        Toast.makeText(getApplicationContext(),
        "Cliquei em Favoritos",
        Toast.LENGTH_SHORT).show();
        break;

        }

        return false;
        }

        });

        Intent intent = getIntent();

        //As variáveis que irão receber os valores da outra janela.
        String titulo, descricao, categoria;
        int miniatura;

        titulo = intent.getExtras().getString("Titulo");
        descricao = intent.getExtras().getString("Descricao");
        categoria = intent.getExtras().getString("Categoria");
        miniatura = intent.getExtras().getInt("Miniatura");

        txtTitulo.setText(titulo);
        txtDescricao.setText(descricao);
        txtCategoria.setText(categoria);
        imagemLivro.setImageResource(miniatura);

        }
        }


