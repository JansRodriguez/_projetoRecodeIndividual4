import './layout.css';

export default () => {
    return (
        <footer className="footer">
            <div class="footer__addr">
                <h1 class="footer__logo">Império Hotel</h1>

                <h2>Contact</h2>

                <address>
                    Galáxia do Infinito, Império

                        <a class="footer__btn" href="mailto:example@gmail.com">Email Us</a>
                </address>
            </div>

            <ul class="footer__nav">
                <li class="nav__item">
                    <h2 class="nav__title">Rede Social</h2>

                    <ul class="nav__ul">
                        <li>
                            <a href="#">Facebook</a>
                        </li>

                        <li>
                            <a href="#">Whatsapp</a>
                        </li>

                        <li>
                            <a href="#">Instagram</a>
                        </li>
                    </ul>
                </li>

                <li class="nav__item">
                    <h2 class="nav__title">Notícias</h2>

                    <ul class="nav__ul">
                        <li>
                            <a href="#">Sobre nós</a>
                        </li>

                        <li>
                            <a href="#">Sobre Pacotes</a>
                        </li>

                        <li>
                            <a href="#">Suporte de Viagens</a>
                        </li>

                        <li>
                            <a href="#">Manual de Pacotes</a>
                        </li>

                        <li>
                            <a href="#">Registros de turismo</a>
                        </li>

                        <li>
                            <a href="#">Notícias dos Países</a>
                        </li>
                    </ul>
                </li>

                <li class="nav__item">
                    <h2 class="nav__title">Suporte</h2>

                    <ul class="nav__ul">
                        <li>
                            <a href="#">FAQ</a>
                        </li>

                        <li>
                            <a href="#">Help Desk</a>
                        </li>

                        <li>
                            <a href="#">Forums</a>
                        </li>
                    </ul>
                </li>
            </ul>

            <div class="legal">
                <p>&copy; 2022 Copyright.</p>

            </div>
        </footer>
    )
}