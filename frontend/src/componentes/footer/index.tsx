import react from 'react';


const Footer = () => {
    return (
        <div>
            <footer className="footer mt-auto py-3 bg-dark">
                <div className="container">
                    <p className="text-light">App desenvolvido por <a href="https://github.com/rmarinheiro" target="_blank" rel="noreferrer">Rafael Marinheiro</a></p>
                    <p className="text-light"><small><strong>Semana Spring React</strong><br />
            Evento promovido pela escola DevSuperior: <a href="https://instagram.com/devsuperior.ig" target="_blank" rel="noreferrer">@devsuperior.ig</a></small></p>
                </div>
            </footer>
        </div>
    );
}

export default Footer;